package com.collectionsex;

public class Person implements Comparable<Person> {

	String name;
	Integer ph;

	public Person(String name, Integer ph) {
		super();
		this.name = name;
		this.ph = ph;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPh() {
		return ph;
	}

	public void setPh(Integer ph) {
		this.ph = ph;
	}

	

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
	
	   public String toString() {
	        return "Person [name=" + name + ", ph=" + ph + "]";
	    }

}
