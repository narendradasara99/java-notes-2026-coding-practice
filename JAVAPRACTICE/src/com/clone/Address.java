package com.clone;

public class Address  {
	String city;

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	
	
}
