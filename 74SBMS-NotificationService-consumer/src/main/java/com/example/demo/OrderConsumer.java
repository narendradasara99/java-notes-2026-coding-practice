package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
	@KafkaListener(topics = "order-topic", groupId = "notification-group")

	public void consume(Order o) {

		System.out.println("received order");
		System.out.println(o.getOrderId());
		System.out.println(o.getProduct());
		System.out.println(o.getAmount());
        System.out.println("Email Sent Successfully");

	}

}
