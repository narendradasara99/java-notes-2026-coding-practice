package com.ImmutableEx;

import java.time.LocalDate;

public final class Employee {
	
	private final String name;
	private final int id;
	private final LocalDate d;
	public Employee(String name, int id, LocalDate d) {
		super();
		this.name = name;
		this.id = id;
		this.d = d.of(2015, 9,1);
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public LocalDate getD() {
		return  d.of(2015, 9,1);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", d=" + d + "]";
	}
	
	
	
	
}
