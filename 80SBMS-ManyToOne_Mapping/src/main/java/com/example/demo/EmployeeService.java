package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository eRepo;
	@Autowired
	private DepartmentRepository dRepo;

	public Employee saveEmp(String EmpName, Long id) {

		Department dept = dRepo.findById(id).orElseThrow(() -> new RuntimeException());

		Employee e = new Employee();
		e.setName(EmpName);
		e.setDepartment(dept);

		return eRepo.save(e);

	}

}
