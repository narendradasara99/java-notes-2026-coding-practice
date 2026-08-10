package com.imp;

public class SingleTonEx {

	private static volatile  SingleTonEx s;

	private SingleTonEx() {

	}

	public static SingleTonEx get() {
		
		if(s==null) {
			synchronized (SingleTonEx.class) {
				if(s==null)
				s=new SingleTonEx();

				
			}
			
		}

		return s;

	}

	public static void main(String[] args) {
		System.out.println(SingleTonEx.get().hashCode());
		System.out.println(SingleTonEx.get().hashCode());
		System.out.println(SingleTonEx.get().hashCode());

	}
}
