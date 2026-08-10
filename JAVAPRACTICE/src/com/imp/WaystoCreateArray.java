package com.imp;

import java.util.Arrays;

public class WaystoCreateArray {
	public static void main(String[] args) {
		
		
		String s="narendra";
		
		String string = new StringBuilder(s).reverse().toString();
		
		String p=s+string.substring(1);
		System.out.println(p);
		
	}
}
