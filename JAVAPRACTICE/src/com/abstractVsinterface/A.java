package com.abstractVsinterface;

public  class A extends Ex {
	

	public A() {
		System.out.println("A constructor");
	}

	@Override
	public void m2() {
		System.out.println("A m2");
	}

	@Override
	public void m1() {
		System.out.println("A m1");
		
	}
	public static void main(String[] args) {
		System.out.println("A main");
		new A();
	}

}
