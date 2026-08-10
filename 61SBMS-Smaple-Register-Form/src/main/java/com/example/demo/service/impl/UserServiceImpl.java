package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserRegister;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository ur;

	@Override
	public String register(UserRegister u) {
		// TODO Auto-generated method stub
		
		if(ur.findByEmail(u.getEmail()).isPresent()) {
			  return "User already exists";
		}
		else {
			ur.save(u);
		return "registratuon successfull";
		}
	}

}
