package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService {
	@Autowired
	PaymentRepo pr;
@Transactional(propagation = Propagation.REQUIRED)
	public void savePayment(Long id) {
		Payment payment = new Payment();

		payment.setStatus("success");
		payment.setOrderId(id);

		pr.save(payment);
	}

}
