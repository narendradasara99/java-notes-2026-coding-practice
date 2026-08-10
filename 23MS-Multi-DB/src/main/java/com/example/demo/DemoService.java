package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dbConfig.primary.User;
import com.example.demo.dbConfig.primary.repository.UserRepository;
import com.example.demo.dbConfig.secondary.Product;
import com.example.demo.dbConfig.secondary.repository.ProductRepository;

@Service
public class DemoService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional("primaryTransactionManager")
    public User saveUser(String name) {
        return userRepository.save(new User(name));
    }

    @Transactional("secondaryTransactionManager")
    public Product saveProduct(String name) {
        return productRepository.save(new Product(name));
    }
}
