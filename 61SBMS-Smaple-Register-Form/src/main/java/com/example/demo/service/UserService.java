package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserRegister;
@Service
public interface UserService {
	
	public String register(UserRegister u);

}
