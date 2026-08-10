package com.covariantreturn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();
		Animal animal = p.getAnimal();
		System.out.println(animal.getClass().getSimpleName());
		

	}

}
