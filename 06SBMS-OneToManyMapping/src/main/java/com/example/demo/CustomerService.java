package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {
	@Autowired
	CustomerRepo c;
	public Customer saveCustomer(Customer customer) {
		
		customer.getOrders().forEach(order -> order.setCustomer(customer));
		
        return c.save(customer);
    }

    public Customer getCustomer(Long id) {
        return c.findById(id)
            .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
