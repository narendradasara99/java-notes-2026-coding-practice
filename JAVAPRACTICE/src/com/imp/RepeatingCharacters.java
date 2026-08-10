package com.imp;

import java.util.Arrays;
import java.util.stream.Stream;

public class RepeatingCharacters {
	
	
	public static void main(String[] args) {
		String s="narendra dasara";
		
		String r="";
		
		for(char c: s.toCharArray()) {
			
			if(r.indexOf(c)==-1) {
				r=r+c;
				
			}
			
			
		}
		System.out.println(r);

		String s2="madam ";
		
		boolean equals = s2.equals(new StringBuilder(s2).reverse().toString());
		System.out.println(equals);
		
		 Arrays.stream(s2.split("")).filter(y->new StringBuilder(y).reverse().toString().equals(y)).findAny();
		
		
	}
	

}
