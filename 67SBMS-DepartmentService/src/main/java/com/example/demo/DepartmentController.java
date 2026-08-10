package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	private DeptClient dc;

	@GetMapping("/getDept")
	public String getDept() {
		String getemployee = dc.getEmp();
		return "dept service running" + getemployee;
	}

	@Value("${app.message}")
	private String message;

	@GetMapping("/config")
	public String getConfigMsg() {
		return message;
	}

}
