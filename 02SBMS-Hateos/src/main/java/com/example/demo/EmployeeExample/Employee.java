package com.example.demo.EmployeeExample;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;

import com.example.demo.Book;

@Component
public class Employee extends RepresentationModel<Employee> {


	private Long id;
	private String name;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
