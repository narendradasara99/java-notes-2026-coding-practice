package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepo repo;
	@Transactional(value = TxType.MANDATORY)
	public void savePayment(Long id) {
		
		Payment p = new Payment();
		p.setOrderId(id);
		p.setStatus("success");
		
		
		repo.save(p);
		
	}

}
