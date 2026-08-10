package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;

@Service
public class PaymentProducer {

	@Autowired
	private KafkaTemplate<String, Payment> kafkaTemplate;

	public void publish(Payment payment) {
		
		
		if (payment.getStatus().equalsIgnoreCase("SUCCESS")) {
           
            kafkaTemplate.send("payment-success", payment);

    		System.out.println("Payment success");
            
        } else {
            kafkaTemplate.send("payment-failed", payment);
            System.out.println("Payment failed");
        }
		

		

	}

}
