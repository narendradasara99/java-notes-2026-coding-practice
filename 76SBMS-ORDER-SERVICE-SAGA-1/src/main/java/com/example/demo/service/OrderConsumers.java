package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderConsumers {
	
	@Autowired
	private OrderRepository repo;
	@KafkaListener(topics = "payment-failed", groupId = "payment-group3")
	public void cancel(Payment p) {
		Integer orderId = p.getOrderId();
		boolean existsById = repo.existsById(orderId);
		if(existsById) {
			repo.deleteById(orderId);
		}
		
		System.out.println("order cancel and deleted");
		
	}
	
	

}
