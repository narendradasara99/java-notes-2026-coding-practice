package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/get")
	public Page<Employee> getEmployees(

			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size,
			@RequestParam(defaultValue = "name") String sortBy, @RequestParam(defaultValue = "asc") String direction) {

		return service.getEM(page, size, sortBy, direction);
	}
}