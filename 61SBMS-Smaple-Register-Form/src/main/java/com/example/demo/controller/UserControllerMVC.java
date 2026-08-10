package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.UserRegister;
import com.example.demo.service.UserService;

@Controller
public class UserControllerMVC {
	 @GetMapping("/")
	    public String loadForm() {
	        return "register";
	    }
	 @Autowired
		private UserService us;
		@PostMapping("/register")
		public String reg( @ModelAttribute UserRegister u,Model m) {
			String register = us.register(u);
			m.addAttribute("msg", register);
			
			return "success";
		}

}
