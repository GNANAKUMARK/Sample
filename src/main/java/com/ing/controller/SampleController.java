package com.ing.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SampleController {
	
	@GetMapping(value = "/hello")
	public void test() {
		System.out.println("Hello Guys");
		
	}

}
