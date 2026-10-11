package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService s;
	
	@GetMapping("get/{id}")
	public OrderDetails getO(@PathVariable("id") Long l) {
		return s.getOrder(l);
	}

}
