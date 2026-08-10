package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Application  implements CommandLineRunner{
	@Autowired
	private DemoService service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.saveUser("narendra");
		service.saveProduct("unicorn");
        System.out.println("Saved user and product in two different DBs!");

	}

}
