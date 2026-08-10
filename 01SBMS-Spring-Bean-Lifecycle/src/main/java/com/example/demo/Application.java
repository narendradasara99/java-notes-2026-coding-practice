package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo","com.naren"},exclude = Date.class )
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		
	}

}
