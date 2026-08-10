package com.abstractVsinterface;

public interface DefaultMethods {
	
	public void father();
	public void mother();
	
	public static void home() {
		System.out.println("TP");
	}
	
	default void child() {
		System.out.println("");
	}

}
