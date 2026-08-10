package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "test-topic", groupId = "my-group")
	public void consume(String msg) {
		System.out.println("Received: " + msg);

	}

}
