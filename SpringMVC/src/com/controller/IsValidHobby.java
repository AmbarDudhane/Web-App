package com.controller;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)	//class required to perform the validations
@Retention(RUNTIME)
@Target(FIELD)
public @interface IsValidHobby {
	
	String listOfValidHobbies() default "Music|Football|Cricket|Hockey";	//This default is added coz when there is no parameter is @IsValid in student class,
	//Spring will refer to this default values of hobbies.
	
	String message() default "Please provide a valid hobby; "+ "accepted hobbies are - Music, Football, Cricket and Hockey (choose anything)";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default{};
}
