package com.example.demo.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
		System.out.println(new BCryptPasswordEncoder().encode("admin123"));
		System.out.println(new BCryptPasswordEncoder().encode("manager123"));
		return "Public API";

	}

	@GetMapping("/user")
	public String user() {
		return "User API";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Admin API";
	}

	@GetMapping("/manager")
	public String manager() {
		return "Manager API";
	}

}
