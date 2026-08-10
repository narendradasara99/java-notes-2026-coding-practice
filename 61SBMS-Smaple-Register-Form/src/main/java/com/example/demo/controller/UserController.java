package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserRegister;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService us;
	@PostMapping("/reg")
	public String reg( @RequestBody UserRegister u) {
		return us.register(u);
	}
	@GetMapping("/get")
	public UserRegister get() {
		UserRegister ur = new UserRegister();
		ur.setEmail("anera");
		return ur;
		
		
	}

}
