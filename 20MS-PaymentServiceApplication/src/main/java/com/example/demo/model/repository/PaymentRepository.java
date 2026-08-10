package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
} 

