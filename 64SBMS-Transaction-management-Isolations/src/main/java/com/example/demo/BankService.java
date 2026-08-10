package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

	@Autowired
	private AccountRepo ar;

	@Transactional(timeout = 5)
	public void updateBalance() throws InterruptedException {
		Account account = ar.findById(1l).get();
		account.setBalance(8000l);
		ar.save(account);
		System.out.println("T1 : Balance Updated to 8000");
		// Wait for 20 seconds before commit
		
		
		Thread.sleep(20000);

		System.out.println("T1 : Transaction Committed");
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
	public void checkBalance() {

		Account account = ar.findById(1L).get();

		System.out.println("T2 Balance = " + account.getBalance());
	}

}
