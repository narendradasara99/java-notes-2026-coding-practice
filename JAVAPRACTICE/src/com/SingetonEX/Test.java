package com.SingetonEX;

public class Test {
	public static void main(String[] args) {


		System.out.println(SingleTonEx.instance.hashCode());
		System.out.println(SingleTonEx.instance.hashCode());
		System.out.println(SingleTonEx.instance.hashCode());

	}

}
