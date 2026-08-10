package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	CustomerRepo repo;
	@Autowired
	CustomerService service;

	@PostMapping("/save")
	public Customer save(@RequestBody Customer c) {
		return repo.save(c);
	}

	@PostMapping("/save/{customerId}")
	public CustomerOrder saveOrder(@PathVariable Long customerId, @RequestBody CustomerOrder order) {

		return service.saveOder(customerId, order);
	}
}
