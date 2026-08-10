package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
		System.out.println(run.getBeanDefinitionCount());

	}

}
