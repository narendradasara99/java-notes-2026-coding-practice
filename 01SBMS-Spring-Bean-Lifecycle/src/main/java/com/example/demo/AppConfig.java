package com.example.demo;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(initMethod = "initMethod", destroyMethod = "customDestroy")
	public Employee em() {
		return new Employee();
	}

	@Bean
	public MybeanPostProcessor my() {
		return new MybeanPostProcessor();
	}

	@Bean
	public BeanFactoryPostProcessor bf() {
		return new BeanFactoryPostProcessor();
	}

}
