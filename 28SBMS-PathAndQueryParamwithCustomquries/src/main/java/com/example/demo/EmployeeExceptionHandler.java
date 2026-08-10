package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler(value = EmployeeNotFoundExcpetion.class)
	public ResponseEntity<String> get(EmployeeNotFoundExcpetion e){
		return new ResponseEntity<String>("employee not found",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
