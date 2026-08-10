package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

	@Autowired
	private OrderRepository repo;

	@KafkaListener(topics = "payment-failed", groupId = "payment-group")
	public void cancel(Oreders o) {
		Oreders order = repo.findById(o.getId()).orElseThrow();

		order.setStatus("CANCELLED");
		repo.save(order);

		System.out.println("Order Cancelled: " + o.getId());

	}

}
