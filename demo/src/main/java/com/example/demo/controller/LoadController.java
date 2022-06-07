package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoadCard;
import com.example.demo.validator.CommonRequestValidator;

@RestController
@RequestMapping("/rest")

public class LoadController {
	
	@PostMapping(value="/load")
	public ResponseEntity<LoadCard> getLoad(@RequestBody LoadCard load){
		
		List<String> errors=CommonRequestValidator.valid(load);
		System.out.println(errors);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
