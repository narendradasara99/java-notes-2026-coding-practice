package com.functionalEx;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test implements Person {

	@Override
	public void detaisl() {
		System.out.println("narendra");
	}

	public static void main(String[] args) {
		new Test().detaisl();

		Consumer c = (b) -> System.out.println(b);
		c.accept(10);
		Supplier s = () -> 190;
		Object object = s.get();
		System.out.println(object);
		
		Predicate<Integer> p= (a)->a%2==0;
		boolean test = p.test(3);
		System.out.println(test);
		

		Person p1 = () -> System.out.println("Ramya");
		p1.detaisl();

	}

}
