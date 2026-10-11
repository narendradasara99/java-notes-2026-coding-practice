package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginRequest;

@RestController
public class AuthController {
	@Autowired
    private  AuthenticationManager authenticationManager;

	@PostMapping("/login")
	public String login(@RequestBody LoginRequest l) {
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(l.getUsername(), l.getPassword()));
		return "login succes full";
		
	}

}
