package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public abstract class TaskProcessor {

	@Lookup
	abstract Task ta();
	
	public void process() {
		System.out.println("task processor"+this.hashCode());
		ta().execute();
	}
	@PostConstruct
	public void init() {
		process();
		process();
		process();

		
		
	}

}
