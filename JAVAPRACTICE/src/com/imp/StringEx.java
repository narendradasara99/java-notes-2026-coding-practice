package com.imp;

public class StringEx {
	
	public static void main(String[] args) {
		char[] c=new char[1];
		c[0]=' ';
		
		String s="narendra";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.contains("n"));
		
		String s1 = new StringBuilder(s).reverse().toString();
		System.out.println();
		
		String r="";
		for (int i = s.length()-1;i>=0; i--) {
			r=r+s.charAt(i);
			
			
		}
		System.out.println(r);
		
	}

}
