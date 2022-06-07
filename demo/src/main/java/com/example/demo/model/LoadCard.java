package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class LoadCard {
	
	@Size(max=1, message="5051")
	@NotNull
	String accountNumber;

}
