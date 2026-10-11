package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	 @PostMapping("/save")
	    public Employee saveEmployee(
	            @RequestParam String name,
	            @RequestParam Long departmentId) {

	        return employeeService.saveEmp(
	                name,
	                departmentId);
	    }

}
