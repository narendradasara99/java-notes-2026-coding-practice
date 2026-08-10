package com.example.demo.saveentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.demo.UserRepository;
import com.example.demo.entity.UserEntity;

@Component
public class saveEntityCommandline implements CommandLineRunner{
	@Autowired
	UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new UserEntity("narendra", "$2a$10$mgnnmlBwfCDAnqyozbCYZOCOgcl.A4M0N8Oxym/y0ttepk/nOSvga", "USER"));
		repo.save(new UserEntity("ramya", "$2a$10$l7jpIxJ3ijtz3Jo29IUWxuS1w9KVUDJRIWQUVUOI.eOAoNe3BafAW", "ADMIN"));
		repo.save(new UserEntity("yashna", "$2a$10$tzSTLKsrJzoWrNsVc7B6CeNPNTxSm5gxMnIR7DB5c80aYxEzk1EgW", "MANAGER"));

		}	

	}
