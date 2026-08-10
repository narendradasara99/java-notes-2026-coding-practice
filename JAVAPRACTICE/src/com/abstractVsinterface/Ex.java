package com.abstractVsinterface;

public  class Ex  implements B,C{
	
	
	
	public Ex() {
		System.out.println("constructor");
		}

	public static void main(String[] args) {
		System.out.println("sjjsj");
		
	
	}

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
		C.super.m3();
	}

}
