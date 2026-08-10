package com.initerfaces;

public interface A {
	
	public void show();
	
	public default void show1() {
		
		System.out.println("show1");
	}
	
	
	private static void showall() {
		
	}

}
