package com.example.demo.dbConfig.primary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dbConfig.primary.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
