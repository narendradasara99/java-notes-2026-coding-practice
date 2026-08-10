package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DeptClientFallBack implements DeptClient{

	@Override
	public String getEmp() {
		// TODO Auto-generated method stub
		return " emp service down";
	}

}
