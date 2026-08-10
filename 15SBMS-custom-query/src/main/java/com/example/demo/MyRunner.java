package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo r;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> employees = List.of(
		        new Employee("Narendra", "IT", 75000),
		        new Employee("Ravi", "HR", 50000),
		        new Employee("Ram", "Finance", 65000),
		        new Employee("John", "IT", 80000)
		);

		r.saveAll(employees);
		r.findAllemp().stream().filter(e->e.getSalary()>6000).forEach(System.out::println);
		Employee findemp = r.findemp("Ravi");
		System.out.println(findemp);
		
		r.deleteEmployee(1);
	}

}
