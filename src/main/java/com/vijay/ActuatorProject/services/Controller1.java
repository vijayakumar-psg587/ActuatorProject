package com.vijay.ActuatorProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/controller1")
public class Controller1 {
	
	@Autowired
	private CounterService counterService;
	
	@RequestMapping(path="/sampleString", method=RequestMethod.GET, 
			consumes={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public @ResponseBody ResponseEntity<String> getSampleString(){
		counterService.increment("sampleString.callCount.increase");
		return new ResponseEntity<String>("SampleString", HttpStatus.OK);
	} 
	
}
