package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "select * from employee where name=? and department=?",nativeQuery = true)
	public List<Employee> getemp(String name,String dept);
	
	@Query(value = "select count(*),department from employee group by department having count(*)>1 ",nativeQuery = true)
	public List<EmpDto> getemp1();

}
