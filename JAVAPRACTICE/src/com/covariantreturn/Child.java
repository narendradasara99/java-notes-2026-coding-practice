package com.covariantreturn;

public class Child extends Parent {
	
	@Override
	Dog getAnimal() {
		System.out.println("Child method");
		return new Dog();
	}

}
