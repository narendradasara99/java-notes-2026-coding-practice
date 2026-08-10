package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class AccountService {
	@Autowired
    private AccountRepo repo;
	

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void readCommittedDemo() throws Exception {

        System.out.println("READ 1: " + repo.findById(1L).get().getBalance());

        Thread.sleep(20000);

        System.out.println("READ 2: " + repo.findById(1L).get().getBalance());
    }

    @Transactional
    public void updateBalance() {

        Account acc = repo.findById(1L).get();
        acc.setBalance(2000);

        System.out.println("UPDATED BALANCE TO 2000");
    }

}
