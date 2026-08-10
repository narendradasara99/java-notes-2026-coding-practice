package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class EmpController {
	@PostMapping("/post")
	public ResponseEntity<String> save(@Valid @RequestBody Employee e) {
		System.out.println(e);
		return ResponseEntity.ok("emp saved");
	}

}
