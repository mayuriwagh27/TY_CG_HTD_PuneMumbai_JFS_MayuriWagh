package com.capgemini.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RequestDeligationController {

	//Redirect the URL
	@GetMapping("/redirect")
	public String redirectRequest() {
		
		return "redirect:http://www.facebook.com";
	}//End of redirectRequest()

	
	//Forward the URL
	@GetMapping("/forward")
	public String forwardRequest() {
		
		return "forward:/login";
	}//End of forwardRequest()
	
	
}//End of class
