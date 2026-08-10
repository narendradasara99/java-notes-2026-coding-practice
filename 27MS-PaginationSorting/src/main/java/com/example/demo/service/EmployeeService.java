package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Page<Employee> getEM(int page, int size, String sort, String d) {
		Sort s = d.equalsIgnoreCase("asc") ? Sort.by(sort).ascending() : Sort.by(sort).descending();
		PageRequest of = PageRequest.of(page, size, s);

		return repository.findAll(of);

	}

	public Page<Employee> getEmp(int page, int size, String sort, String d) {
		Sort s = d.equalsIgnoreCase("asc") ? Sort.by(sort).ascending() : Sort.by(sort).descending();

		PageRequest of = PageRequest.of(page, size, s);
		return repository.findAll(of);
	}

}
