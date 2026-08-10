package com.example.demo.dbConfig.second.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dbConfig.primary.entity.Employee;
import com.example.demo.dbConfig.second.entity.Department;

public interface DeptRepository extends JpaRepository<Department, Integer> {

}
