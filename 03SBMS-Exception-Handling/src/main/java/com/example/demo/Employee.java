package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.Nonnull;

@Component
public class Employee {
	
	
	Long id;
	
	String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
