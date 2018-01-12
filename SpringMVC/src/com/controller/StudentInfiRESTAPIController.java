package com.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfiRESTAPIController {
	
	//************Writing web service to fetch students' records***********
	//@ResponseBody
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Student> getStudentList(){
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setStudentName("Ambar");
		s1.setStudentMobile(new Long("8483986803"));
				
		Student s2 = new Student();
		s2.setStudentName("Priyanka");
		s2.setStudentMobile(new Long("9561818116"));
				
		Student s3 = new Student();
		s3.setStudentName("Harshal");
		s3.setStudentMobile(new Long("1234567890"));
				
		list.add(s1);
		list.add(s2);
		list.add(s3);
				
		return list;
	}
			
	//**********Fetching one student's records*************
	//@ResponseBody
	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET, produces="application/xml")
	public Student getStudent(@PathVariable("name") String studentName){
		Student s1 = new Student();
		s1.setStudentName(studentName);
		s1.setStudentHobby("Coding");
		return s1;
	}
}
