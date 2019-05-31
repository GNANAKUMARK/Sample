package com.ing.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SampleController {
	private static final Logger LOGGER = LogManager.getLogger(SampleController.class);
	@GetMapping(value = "/hello")
	public void test() {
		LOGGER.info("Enter SampleController::test");
		LOGGER.debug("in side test method");
		System.out.println("Hello Guys");
		LOGGER.info("Enter SampleController::test");
		
	}

}
