package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService repo;

	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return repo.saveCustomer(customer);
	}

	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return repo.getCustomer(id);
	}

}
