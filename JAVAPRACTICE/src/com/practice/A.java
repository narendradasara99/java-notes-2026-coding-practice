package com.practice;

public class A {
	int i;

	public A(int i) {
		this();
		this.i = i;

	}

	public A() {
		System.out.println("default constructor");
		// TODO Auto-generated constructor stub
	}

	private void m() {
		// TODO Auto-generated method stub

	}

	private A m2() {
		this.m();
		// TODO Auto-generated method stub
		return this;

	}

	public static void main(String[] args) {
		A a = new A(10);
		System.out.println(a.i);
	}

}
