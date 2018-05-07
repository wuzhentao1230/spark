package com.stackroute.demo.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.demo.service.SparkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("v1/api/swisit")
public class SparkController {
	
	@Autowired
	SparkService sparkService;
	
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public ResponseEntity get()
	{
		System.out.println("inside controller");
		sparkService.sparkListener("my-topic");
		return new ResponseEntity("data get",HttpStatus.OK);
		
		
	}

}
