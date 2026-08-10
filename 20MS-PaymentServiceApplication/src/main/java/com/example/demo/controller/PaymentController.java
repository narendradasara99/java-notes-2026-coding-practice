package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.model.dto.PaymentRequest;
import com.example.demo.model.dto.PaymentResponse;
import com.example.demo.model.repository.PaymentRepository;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/pay")
    public String pay() {
        return "Payment Successful";
    }
    
    @PostMapping("/pay1")
    public PaymentResponse pay(@RequestBody PaymentRequest request) {

        Payment payment = new Payment();
        payment.setOrderId(request.getOrderId());
        payment.setAmount(request.getAmount());
        payment.setStatus("PAID");

        Payment savedPayment = paymentRepository.save(payment);

        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(savedPayment.getId());
        response.setStatus(savedPayment.getStatus());

        return response;
    }
}