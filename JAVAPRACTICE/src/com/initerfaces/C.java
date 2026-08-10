package com.initerfaces;

public class C implements A,B{

	@Override
	public void showdiff() {
		// TODO Auto-generated method stub
		System.out.println("shodiff");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}
	
public  void show1() {
		
		System.out.println("show1");
	}
	public static void main(String[] args) {
		
		
		C c = new C();
		
		c.show();
		c.showdiff();
		c.show1();
	}

}
