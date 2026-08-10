package com.example.demo.dbConfig.secondary.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dbConfig.secondary.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}

