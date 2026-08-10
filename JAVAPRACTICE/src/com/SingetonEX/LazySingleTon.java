package com.SingetonEX;

public class LazySingleTon {
	
	private static volatile LazySingleTon ex;
	
	private LazySingleTon() {
		// TODO Auto-generated constructor stub
	}
	
	public static LazySingleTon get() {
		if(ex==null) {
			synchronized(LazySingleTon.class) {
				if(ex==null)
			ex=new LazySingleTon();
			}
		}
		return ex;
	}

}
