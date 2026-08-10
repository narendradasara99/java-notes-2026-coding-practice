package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(EmpController.class)
public class Employeecontroller {
	@MockBean
	public EmployeeService service;
	@Autowired
	public MockMvc mvc;

	@Test
	public void getTest() throws Exception {
		
		Employee employee = new Employee(1, "Narendra");
		
		Mockito.when(service.get(1)).thenReturn(employee);
		
		mvc.perform(MockMvcRequestBuilders.get("/get/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(1))
        .andExpect(jsonPath("$.name").value("Narendra"));

	}

}
