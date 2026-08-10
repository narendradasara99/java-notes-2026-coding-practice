package com.stringExx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="mad";
		
		String p="";
	for(int i=s.length()-1;i>=0;i--) {
		
		p=p+s.charAt(i);
		
	}
	System.out.println(p);
	
	
	s=s+p.substring(1);
	System.out.println(s);
		
		
		
		

	}
}