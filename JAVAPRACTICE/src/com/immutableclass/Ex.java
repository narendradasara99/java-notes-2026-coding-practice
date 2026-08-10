package com.immutableclass;

import java.util.ArrayList;

public class Ex {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("sarapaka");
		a.add("bdchala");
		Person person = new Person("narendra", 902922828d, a);
		a.add("ndg");
		System.out.println(person);
		System.out.println(person.getA());
		
	}

}
