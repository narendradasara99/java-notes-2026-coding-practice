package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	AccountService s;
	
	 @PostMapping("/transfer")
	    public String transfer(
	            @RequestParam Long from,
	            @RequestParam Long to,
	            @RequestParam double amount) {

	     return   s.transfer(
	                from,
	                to,
	                amount);

	        
	    }
	

}
