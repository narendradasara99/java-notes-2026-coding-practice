package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class AccountLoad {
	@Autowired
	AccountRepo repo;
	@PostConstruct
	public void save() {
		Account account = new Account();
		account.setBalance(1000l);
		repo.save(account);
	}

}
