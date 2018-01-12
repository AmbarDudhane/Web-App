package com.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	
	private String listOfValidHobbies;
	@Override
	public void initialize(IsValidHobby arg0) {
		// TODO Auto-generated method stub
		this.listOfValidHobbies = arg0.listOfValidHobbies();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(studentHobby == null){
			return false;
		}
		
		if(studentHobby.matches(listOfValidHobbies)){
			System.out.println("In the isValid of HobbyValidator...");
			return true;
		} else {
			return false;
		}
	}

}
