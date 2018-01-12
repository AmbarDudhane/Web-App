package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	StudentAdmissionController(){
		System.out.println("Hi...");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[] {"studentMobile"});	//This is added in order to not bind mobile no to the Student class
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");	//This is added in order to customize Date field on UI
		binder.registerCustomEditor(Date.class, "studentDOB",new CustomDateEditor(dateformat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());  //REGISTERING OWN CUSTOM PROPERTY EDITOR
	}
	
	@RequestMapping(value="/admissionForm.html", method= RequestMethod.GET)
	public ModelAndView admissionForm() throws Exception{
		
		/*String exceptionOccurred = "NullPointerException";
		
		if(exceptionOccurred.equalsIgnoreCase("NullPointerException")){
			throw new NullPointerException(" Null Pointer Exception");
		}*/
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@ModelAttribute
	public void addCommonObjects(Model model1){
		model1.addAttribute("headerMsg", "College Of Engineering, Pune1");
	}
	
	@RequestMapping(value="/submitAdmission.html", method= RequestMethod.POST)
	public ModelAndView submitForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
		System.out.println("In submitForm..!!!");
		
		if(result.hasErrors()){
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSubmit");
		System.out.println("In submitForm2..!!!");
		return model;
	}
	
	
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e){
		e.printStackTrace();
		
		return "NullPointerException";	//returning the name of the view...
	}
	
}
