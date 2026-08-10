package com.example.demo.dbConfig.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dbConfig.primary.User;


public interface UserRepository extends JpaRepository<User, Long> {}
