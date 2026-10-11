package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	AccountRepository repo;

	public String transfer(Long from, Long to, double amount) {

		Account fromAcconut = repo.findById(from).orElseThrow(() -> new RuntimeException("sender details not found"));
		Account toAcconut = repo.findById(to).orElseThrow(() -> new RuntimeException("Receiver account not found"));

		if (fromAcconut.getBalance() < amount) {
			throw new RuntimeException("insuffiecient balances");
		}

		fromAcconut.setBalance(fromAcconut.getBalance() - amount);

		toAcconut.setBalance(toAcconut.getBalance() + amount);

		repo.save(fromAcconut);
		repo.save(toAcconut);
		return "payment transferred succesfully";
	}

}
