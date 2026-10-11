package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Component
public class saveEntityCommandline implements CommandLineRunner{
	@Autowired
	UserRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new User("narendra", "$2a$10$mgnnmlBwfCDAnqyozbCYZOCOgcl.A4M0N8Oxym/y0ttepk/nOSvga", "USER"));
		repo.save(new User("ramya", "$2a$10$l7jpIxJ3ijtz3Jo29IUWxuS1w9KVUDJRIWQUVUOI.eOAoNe3BafAW", "ADMIN"));
		repo.save(new User("yashna", "$2a$10$tzSTLKsrJzoWrNsVc7B6CeNPNTxSm5gxMnIR7DB5c80aYxEzk1EgW", "MANAGER"));
	
	}	

}

