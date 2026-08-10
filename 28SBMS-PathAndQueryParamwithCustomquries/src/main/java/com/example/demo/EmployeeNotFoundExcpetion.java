package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EmployeeNotFoundExcpetion extends Exception {
	
	public EmployeeNotFoundExcpetion() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeNotFoundExcpetion(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
	

}
