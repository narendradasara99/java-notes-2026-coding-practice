package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<String> npe(NullPointerException n) {

		return new ResponseEntity<String>(" String Can not be null", HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
