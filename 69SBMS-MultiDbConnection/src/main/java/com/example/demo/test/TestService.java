package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dbConfig.primary.entity.Employee;
import com.example.demo.dbConfig.primary.repo.EmployeeRepository;
import com.example.demo.dbConfig.second.entity.Department;
import com.example.demo.dbConfig.second.repo.DeptRepository;

import jakarta.annotation.PostConstruct;

@Component
public class TestService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DeptRepository dept;

	@PostConstruct
	public void save() {

		employeeRepository.save(new Employee("narendra"));
		dept.save(new Department("IT"));

	}

}
