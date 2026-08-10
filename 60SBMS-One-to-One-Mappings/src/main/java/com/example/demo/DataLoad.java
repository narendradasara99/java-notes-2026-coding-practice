package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DataLoad implements CommandLineRunner {
	@Autowired
	PersonRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("data load");
		
		Passport pass = new Passport();
		pass.setpNo("1234");
		
		Person p = new Person();
		p.setName("narendra");
		p.setPass(pass);
		
		

		repo.save(p);

	}

}
