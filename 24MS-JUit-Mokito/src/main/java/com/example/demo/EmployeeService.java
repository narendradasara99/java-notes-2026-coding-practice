package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public Employee get(int id) {
		return new Employee(1, "Narendra");
		}

}
