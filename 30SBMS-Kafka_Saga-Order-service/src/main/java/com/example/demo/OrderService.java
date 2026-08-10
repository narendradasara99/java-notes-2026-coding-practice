package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	@Autowired
	private OrderProducer producer;

	public Oreders create(String product) {

		Oreders o = new Oreders();
		o.setProduct(product);
		o.setStatus("CREATED");

		repo.save(o);

		producer.send(o);

		return o;
	}

}
