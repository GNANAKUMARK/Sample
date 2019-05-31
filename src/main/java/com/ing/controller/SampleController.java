package com.ing.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.request.SampleRequest;
import com.ing.response.SampleResponse;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SampleController {
	private static final Logger LOGGER = LogManager.getLogger(SampleController.class);

	@GetMapping(value = "/hello")
	public ResponseEntity<SampleResponse> test() {
		LOGGER.info("Enter SampleController::test");
		LOGGER.debug("in side test method");
		SampleResponse response = new SampleResponse();
		//ResponseEntity<SampleResponse> responseEntity =null;
		try {
			System.out.println("Hello Guys");
			LOGGER.info("Enter SampleControlletest");
			response.setMessage("Hello Guys");
		} catch (Exception e) {
			return new  ResponseEntity<SampleResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			//re
		}
		return new ResponseEntity<SampleResponse>(response,HttpStatus.OK);

	}

}
