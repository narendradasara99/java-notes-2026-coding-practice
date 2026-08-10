package com.example.demo;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo repo;
	@Autowired
	CustomerOrderRepo oRepo;

	public CustomerOrder saveOder(Long id, CustomerOrder co) {

		Customer customer = repo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
		co.setC(customer);
		return oRepo.save(co);
	}

}
