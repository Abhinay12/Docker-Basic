package com.docker.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	
	@GetMapping("v1/hello")
	private String getData() {
		return "Abhinay";
		
		
	}
}
