package com.imp;

public class CountVowels {
	
	public static void main(String[] args) {
		
		
		String s="narendra";
		for(String s1:s.split("")) {
			System.out.println("aeiouAEIOU".indexOf(s1));
			if("aeiouAEIOU".indexOf(s1)!=-1) {
				System.out.println(s1);
			}
		}
		
		
		s.chars().filter(s1->("aeiouAEIOU".indexOf(s1)!=-1)).forEach(a->System.out.println((char)a));
		
		
		
	}

}
