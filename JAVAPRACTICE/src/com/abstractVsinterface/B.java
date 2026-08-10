package com.abstractVsinterface;

public interface B {
	
	int a=90;
	
	void m1();
	void m2();
	
	default void m3() {
		System.out.println("default method");
	}

}
