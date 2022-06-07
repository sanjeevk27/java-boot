package com.example.demo.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;



public class CommonRequestValidator {

	
	public static <T> List<String> valid( T input)
	{
		
		List<String> errors=new ArrayList<String>();

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<T>> violation=validator.validate(input);
		
		if(violation.size()>0) {
			for(ConstraintViolation<T> v:violation)
			{
				errors.add(v.getPropertyPath()+" "+v.getMessage());
			}
		}
		return errors;
	}
	
}
