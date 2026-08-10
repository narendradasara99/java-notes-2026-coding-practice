package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public Optional<Employee> findByName(String name);
	
	@Query("select e from Employee e")
	public List<Employee> findAllemp();
	
	@Query("select e from Employee e where e.name=:name")
	public Employee findemp(String name);
	
	@Query("SELECT e FROM Employee e WHERE e.salary > 1")
	List<Employee> getSalary(double salary);

	@Modifying
	@Transactional
	@Query("DELETE FROM Employee e WHERE e.id = :id")
	void deleteEmployee(@Param("id") Integer id);
}
