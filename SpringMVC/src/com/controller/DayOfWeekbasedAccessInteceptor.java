package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekbasedAccessInteceptor extends HandlerInterceptorAdapter{
	
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler){
		
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		
		if(dayOfWeek == 1){
			try {
				res.getWriter().write("Website is closed on sunday!!! Please try later!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		
		return true;
	}
	
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView model){
		//this method will be called after Spring MVC executes request handler method
		System.out.println("HandlerInterceptorAdapter Spring MVC called postHandle method!!! "+req.getRequestURI().toString());
	}
	
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex){
		//this method will be called after the response object is produced by the view for the request
		System.out.println("HandlerInterceptorAdapter Spring MVC called afterCompletion method!!! "+req.getRequestURI().toString());
	}
}
