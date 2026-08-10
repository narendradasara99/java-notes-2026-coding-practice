package com.abstractVsinterface;

public class DefaultMethods2 implements DefaultMethods {
	
	public static void home() {
		System.out.println("TP");
	}

	@Override
	public void father() {
		System.out.println("narendra");
	}

	@Override
	public void mother() {
		// TODO Auto-generated method stub
		System.out.println("Ramya");
	}
	
	@Override
	public void child() {
		// TODO Auto-generated method stub
		
		System.out.println("yashna");
	}
	
	public static void main(String[] args) {
		DefaultMethods d = new DefaultMethods2();
		d.father();
		d.mother();
		d.child();
		
		DefaultMethods.home();
		
	}

}
