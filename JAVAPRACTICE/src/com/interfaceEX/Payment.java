package com.interfaceEX;

public  interface Payment {
	public Double d = 290d;

	abstract void pay(Double am);
	
	default void view() {
		System.out.println( "view payment");
	}

}
