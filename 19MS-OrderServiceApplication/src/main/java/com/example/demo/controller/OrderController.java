package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.client.PaymentClient;
import com.example.demo.client.PaymentClient1;
import com.example.demo.model.Order;
import com.example.demo.model.dto.PaymentRequest;
import com.example.demo.model.dto.PaymentResponse;

import jakarta.transaction.Transactional;

@RestController
@RefreshScope
@RequestMapping("/order")
public class OrderController {

	@Autowired
	PaymentClient paymentClient;
	
	@Autowired
	PaymentClient1 paymentClient1;
	
	@Autowired
    private OrderRepository orderRepository;

	@GetMapping("/place")
	public ResponseEntity<String> placeOrder() {

		String response = paymentClient.makePay();
		Order order = new Order();
        order.setProductName("Laptop");
        order.setAmount(75000);
        order.setStatus("SUCCESS");
        order.setOrderDate(LocalDateTime.now());

        orderRepository.save(order);

		return new ResponseEntity<String>("Order placed successfully" + response, HttpStatus.OK);
	}
	
	
	
	@PostMapping("/place1")
	@Transactional
    public Order placeOrder(@RequestBody Order request) {

        // SAVE ORDER
        Order order = new Order();
        order.setProductName(request.getProductName());
        order.setAmount(request.getAmount());
        order.setOrderDate(LocalDateTime.now());
        order.setStatus("CREATED");

        Order savedOrder = orderRepository.save(order);

        // CALL PAYMENT SERVICE USING FEIGN
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setOrderId(savedOrder.getId());
        paymentRequest.setAmount(savedOrder.getAmount());

        PaymentResponse paymentResponse =
                paymentClient1.doPayment(paymentRequest);

        // UPDATE ORDER
        savedOrder.setPaymentId(paymentResponse.getPaymentId());
        savedOrder.setStatus(paymentResponse.getStatus());

        return orderRepository.save(savedOrder);
    }

}
