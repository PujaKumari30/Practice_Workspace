package com.pkp.practice.firstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstAppDemo {
	
	@RequestMapping("/first")
	@GetMapping
	public String returnValue() {
		
		return "Hello Everyone ! Hey";
		
	}
	
	
	@RequestMapping("/hello")	
	public String returnHello() {
		return "Hey buddy";
	}

	//Hey this is my 2nd commit
	

}
