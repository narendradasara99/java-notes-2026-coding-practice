package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private DepartmentRepository dept;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.setName("Narendra");
		Employee e2 = new Employee();
		e2.setName("Ramya");
		Employee e3 = new Employee();
		e3.setName("Balu");
		Department d = new Department();
		d.setDeptName("IT");
		e1.setDept(d);
		e2.setDept(d);
		e3.setDept(d);
		d.setEmployees(List.of(e1,e2,e3));
		dept.save(d);

	}

}
