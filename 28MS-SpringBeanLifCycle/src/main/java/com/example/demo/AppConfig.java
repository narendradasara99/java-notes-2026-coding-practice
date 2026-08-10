package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
	public BeanLifeCycle beanLifeCycle() {
		return new BeanLifeCycle();
	}

}
