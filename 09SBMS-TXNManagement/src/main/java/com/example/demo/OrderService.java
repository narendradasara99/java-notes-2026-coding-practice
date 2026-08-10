package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;



@Service
public class OrderService {
	@Autowired
	OrderRepo or;
	@Autowired
	PaymentService ps;

	@Transactional(rollbackFor = Exception.class)
	public String placeOrder() throws ClassNotFoundException {
		Orders o = new Orders ();
		o.setPrice(65000);
		o.setProduct("tv");

		Orders save = or.save(o);
		ps.savePayment(save.getId());
		
		if (true) {
			throw new  ClassNotFoundException();
		}


		return "Ordersuccess";

	}

}
