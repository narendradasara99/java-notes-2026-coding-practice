package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("narendra");
		user.setPassword(encoder.encode("1234"));
		user.setRole("USER");

		User admin = new User();
		admin.setUsername("admin");
		admin.setPassword(encoder.encode("admin123"));
		admin.setRole("ADMIN");

		repository.save(user);
		repository.save(admin);

	}

}
