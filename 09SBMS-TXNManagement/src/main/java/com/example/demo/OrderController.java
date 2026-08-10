package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService service;

	@PostMapping("/place")
	public String place() throws ClassNotFoundException {
		return service.placeOrder();

	}
}
