package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;

@Service
public class PaymentConsumer {
	@Autowired
	private PaymentProducer pp;

	@KafkaListener(topics = "order-topic", groupId = "payment-group")
	public void consume(Orders order) {
		System.out.println("Order Received");

		System.out.println(order.getOrderId());

		System.out.println(order.getProduct());

		System.out.println(order.getAmount());

		Payment p = new Payment();
		p.setOrderId(order.getOrderId());
		p.setPaymentId(order.getOrderId());
		p.setStatus("success");//fail

		pp.publish(p);

		System.out.println("Payment Completed");

	}

}
