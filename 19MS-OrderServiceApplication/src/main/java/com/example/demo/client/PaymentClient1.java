package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.dto.PaymentRequest;
import com.example.demo.model.dto.PaymentResponse;

@FeignClient(name = "payment-service")

public interface PaymentClient1 {

    @PostMapping("/payment/pay1")
    PaymentResponse doPayment(@RequestBody PaymentRequest request);
}