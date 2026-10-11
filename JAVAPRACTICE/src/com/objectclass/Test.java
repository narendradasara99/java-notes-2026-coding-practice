package com.objectclass;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee("narendra", "IT", 9003d);
		Employee e2 = new Employee("narendra", "IT", 9003d);
		Employee e3 = new Employee("y", "IT", 9003d);

		final Integer x = Integer.valueOf(10);

		

		System.out.println(x);

		System.out.println(e1.equals(e1));

		System.out.println(e1.hashCode() == e2.hashCode());

		System.out.println(e1.hashCode() == e3.hashCode());

	}

}
