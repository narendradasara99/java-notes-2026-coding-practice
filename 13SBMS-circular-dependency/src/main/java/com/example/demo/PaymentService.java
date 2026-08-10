package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	private OrderService os;

	public OrderService getOs() {
		return os;
	}

	@Autowired
	public void setOs(OrderService os) {
		this.os = os;
	}

}
