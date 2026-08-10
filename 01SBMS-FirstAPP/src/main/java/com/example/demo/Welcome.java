package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	public Welcome() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping(value = "welcome")
	public ResponseEntity<Person> wel() {
		Person person = new Person("narendra", "tp");
		return new ResponseEntity<>(person, HttpStatus.OK);
	}

	@PostMapping(value = "get", consumes = { org.springframework.http.MediaType.APPLICATION_XML_VALUE,
			org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Person> get(@RequestBody Person p) {
		return new ResponseEntity<>(p, HttpStatus.OK);
	}

	@GetMapping("greet")
	public String gerret() {
		return "good evening";
	}
}
