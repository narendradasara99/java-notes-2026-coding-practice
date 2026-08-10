package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EmpDto {
	private Long id;
	private String dapartment;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDapartment() {
		return dapartment;
	}
	public void setDapartment(String dapartment) {
		this.dapartment = dapartment;
	}
	public EmpDto(Long id, String dapartment) {
		super();
		this.id = id;
		this.dapartment = dapartment;
	}
	public EmpDto() {
		super();
	}
	
	
	

}
