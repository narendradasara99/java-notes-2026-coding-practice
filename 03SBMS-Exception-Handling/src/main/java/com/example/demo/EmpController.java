package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	@GetMapping("/get/{id}")
	public Employee get(@PathVariable Long id) throws EmployeeNotFOundExcpetion {
		Employee e = new Employee();
		e.setId(1l);
		e.setName("Narendra");
		if (id == 1)
			return e;
	
			throw new EmployeeNotFOundExcpetion("employee not found");
		

	}
	
	
	
	@ExceptionHandler(value = EmployeeNotFOundExcpetion.class)
	public ResponseEntity<String> handle(EmployeeNotFOundExcpetion e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	}
	
	
	
	
	

}
