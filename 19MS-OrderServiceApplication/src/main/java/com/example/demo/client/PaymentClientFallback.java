package com.example.demo.client;

import org.springframework.stereotype.Component;

@Component
public class PaymentClientFallback implements PaymentClient {

	@Override
	public String makePay() {
		System.out.println("fallback called");
		return "Payment Service DOWN (Fallback Response)";
	}
}
 