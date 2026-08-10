package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Component
public class Employee {
	
	

	@NotBlank(message = "name is required")
	private String name;
	@Email(message = "invalid email")
	private String email;
	@Min(value = 18, message = "age must be atlease 18")
	int age;
	@Size(min = 8, message = "Password must contain at least 8 characters")
	String password;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", age=" + age + ", password=" + password + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
