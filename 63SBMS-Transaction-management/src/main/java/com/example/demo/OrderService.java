package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class OrderService {
	@Autowired
	private OrderRepo or;
	@Autowired
	PaymentService ser;
	
	@Transactional
	public String placeOrder() {
		
		Orders o = new Orders();
		o.setPrice(90.0);
		o.setProduct("mobile");
		
		Orders save = or.save(o);
		ser.savePayment(save.getId());
		
		
if(true) {
	throw new RuntimeException();
}

		
		return "order success";
		
	}
	
	

}
