package com.example.demo.model.dto;

import org.springframework.stereotype.Component;

@Component
public class PaymentResponse {
	
	private Long paymentId;
    private String status;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
