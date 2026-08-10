package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.Orders;

@Service
public class OrderProducer {

	
	@Autowired
	private KafkaTemplate<String, Orders> kt;
	
	public void send(Orders o) {
		
		kt.send("order-topic",o.getOrderId().toString(),o);
        System.out.println("Order Published");

		
	}
	
	
	
	
}
