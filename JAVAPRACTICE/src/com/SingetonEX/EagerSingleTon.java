package com.SingetonEX;

public class EagerSingleTon {
	
	private static final EagerSingleTon ex=new EagerSingleTon();
	
	private EagerSingleTon() {
		// TODO Auto-generated constructor stub
	}
	
	public static EagerSingleTon getInstance() {
		return ex;
	}

}
