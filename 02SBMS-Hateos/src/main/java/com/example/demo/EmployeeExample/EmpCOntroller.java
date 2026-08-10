package com.example.demo.EmployeeExample;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpCOntroller {
	@GetMapping(value = "/get/{id}")
	public EntityModel<Employee> getEmp(@PathVariable Long id) {
		
		
	    Employee emp = new Employee();
        emp.setId(id);
        emp.setName("Narendra");
        emp.setSalary(50000);
        
        EntityModel<Employee> model = EntityModel.of(emp);

        model.add(WebMvcLinkBuilder. linkTo(WebMvcLinkBuilder. methodOn(EmpCOntroller.class)
                .getEmp(id)).withSelfRel());

        model.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(EmpCOntroller.class)
                .getAllEmployees()).withRel("allEmployees"));

        
		return model;

	}

	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
	    return List.of();
	}

}
