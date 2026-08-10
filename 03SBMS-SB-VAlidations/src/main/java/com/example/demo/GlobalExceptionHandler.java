package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> han(MethodArgumentNotValidException me) {
		HashMap<String, String> hashMap = new HashMap<>();

		me.getBindingResult().getFieldErrors().forEach(e -> hashMap.put(e.getField(), e.getDefaultMessage()));

		return ResponseEntity.badRequest().body(hashMap);
	}

}
