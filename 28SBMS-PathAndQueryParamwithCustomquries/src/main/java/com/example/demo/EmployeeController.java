package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repo;

	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmp(@PathVariable("id") Integer id) throws EmployeeNotFoundExcpetion {

		Optional<Employee> byId = repo.findById(id);
		if(!byId.isPresent()) {
			throw new EmployeeNotFoundExcpetion();
		}

		return new ResponseEntity<Employee>(byId.get(), HttpStatus.OK);
	}

	@GetMapping("/getEmp")
	public ResponseEntity<List<Employee>> getBySal(@RequestParam("dept") String dept,
			@RequestParam("name") String name) throws EmployeeNotFoundExcpetion {
		
		Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(EmployeeController.class).getEmp(1))
				.withRel("employee based on id 1");
	


		List<Employee> getemp = repo.getemp(name, dept);
		
		for(Employee e:getemp) {
			if(e.getId()==1) {
				e.add(withRel);
			}
		}
	

		return new ResponseEntity<List<Employee>>(getemp, HttpStatus.OK);
	}

	@GetMapping("/getEmp1")
	public ResponseEntity<List<EmpDto>> getBy() {
		List<EmpDto> getemp = repo.getemp1();

		return new ResponseEntity<List<EmpDto>>(getemp, HttpStatus.OK);
	}

}
