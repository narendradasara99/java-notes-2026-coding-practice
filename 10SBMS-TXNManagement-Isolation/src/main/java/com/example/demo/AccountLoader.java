package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class AccountLoader {
	@Autowired
	private AccountRepo a;

	@PostConstruct
	public void save() {
		a.save(new Account(1000));
	}

}
