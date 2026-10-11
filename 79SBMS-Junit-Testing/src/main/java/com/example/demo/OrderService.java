package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	private OrderDetailsRepo repo;
	
	public OrderDetails getOrder(Long id) {
		
		return repo.findById(id).orElseThrow(()->new RuntimeException("order not found"));
	}
	

}
