package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcoonutCotroller {
	@Autowired
	AccountService service;

	// Thread 1
	@GetMapping("/read")
	public String read() throws Exception {
		service.readCommittedDemo();
		return "read Done!";
	}

	// Thread 2
	@GetMapping("/update")
	public String update() {
		service.updateBalance();
		return "UPDATED";
	}

}
