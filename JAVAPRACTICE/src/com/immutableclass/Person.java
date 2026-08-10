package com.immutableclass;

import java.util.ArrayList;
import java.util.List;

public final class Person {
	private final String name;
	private final Double adhar;
	private final List<String> a;
	public Person(String name, Double adhar, List<String> l) {
	    this.name = name;
	    this.adhar = adhar;
	    this.a = new ArrayList<>(l);   // defensive copy
	}
	public String getName() {
		return name;
	}
	public Double getAdhar() {
		this.a.add("hyd");
		return adhar;
	}
	public List<String> getA() {
		this.a.add("hyd");

		return new ArrayList<>(a);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", adhar=" + adhar + ", a=" + a + "]";
	}
	
	
	
	

}
