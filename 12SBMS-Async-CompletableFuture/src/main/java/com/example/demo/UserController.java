package com.example.demo;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private PaymentService paymentService;

	@GetMapping("/dashboard")
	public String dashboard() throws Exception {
		Instant now = Instant.now();

		CompletableFuture<String> user = userService.getUser().thenApply(String::toUpperCase);
		
		CompletableFuture<String> order = orderService.getOrders();

		CompletableFuture<String> payment = paymentService.getPayment().exceptionally(ex -> "Payment Failed");;
		
	CompletableFuture.anyOf(user,order,payment);
		
		Instant now2 = Instant.now();

		System.out.println("TIME:" + Duration.between(now, now2));

		return user.get() + " " + order.get() + " " + payment.get();
	}

}
