package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	

	public HelloController(){
		System.out.println("loadad");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView("HelloPage");
		mav.addObject("msg", "Hello World!!!");

		return mav;
	}

}
