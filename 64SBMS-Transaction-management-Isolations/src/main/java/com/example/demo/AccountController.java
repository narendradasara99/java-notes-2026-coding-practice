package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	 @Autowired
	    private BankService service;

	    @GetMapping("/update")
	    public String update() throws Exception {

	        service.updateBalance();

	        return "Updated";
	    }

	    @GetMapping("/check")
	    public String check() {

	        service.checkBalance();

	        return "Checked";
	    }
	
}
