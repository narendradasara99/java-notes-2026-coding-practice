package com.covariantreturn;

public class Parent {
	
	Animal getAnimal() {
		System.out.println("parent method");
		return new Animal();
	}

}
