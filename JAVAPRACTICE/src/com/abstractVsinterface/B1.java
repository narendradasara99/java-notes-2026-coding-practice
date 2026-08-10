package com.abstractVsinterface;

public class B1 implements B {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("sub "+a);
	
	}

	public static void main(String[] args) {
		B b1 = new B1();
		b1.m3();

	}

}
