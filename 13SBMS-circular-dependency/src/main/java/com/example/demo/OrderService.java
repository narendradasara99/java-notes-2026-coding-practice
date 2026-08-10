package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private PaymentService ps;

	public PaymentService getPs() {
		return ps;
	}
@Autowired
	public void setPs(PaymentService ps) {
		this.ps = ps;
	}
	

}
