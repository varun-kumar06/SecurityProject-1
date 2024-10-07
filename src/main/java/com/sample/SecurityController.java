package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping(value="/student")
	public String getStudent() {
		return "I am Student";
	}

	@GetMapping(value="/teacher")
	public String getTeacher() {
		return "I am Teacher";
	}
	
	@GetMapping(value="/manager")
	public String getManager() {
		return "I am Manager";
	}
}
