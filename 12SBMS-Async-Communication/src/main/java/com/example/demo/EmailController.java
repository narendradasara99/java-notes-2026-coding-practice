package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired
	private EmailService service;
	@GetMapping("/send")
	public String send() {
		
		
		service.senMail();
		
		return "User register successfully";
	}
	
	@GetMapping("/get")
	public String get() {
		
		
		String getdetils = service.getdetils();
		
		return getdetils;
	}
	

}
