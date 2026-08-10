package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("qa")
public class TestController {
	@Value(value = "${a}")
	public String ab;
	@GetMapping("/get")
	public String test() {
		
		return "testing  "+ab;
	}

}
