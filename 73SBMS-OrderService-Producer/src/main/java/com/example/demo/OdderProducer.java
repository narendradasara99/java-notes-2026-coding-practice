package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OdderProducer {
	@Autowired
	KafkaTemplate<String, Order> kt;
	
	
	public void send(Order o) {
		kt.send("order-topic",o);
        System.out.println("Order Sent : " + o.getProduct());

	}

}
