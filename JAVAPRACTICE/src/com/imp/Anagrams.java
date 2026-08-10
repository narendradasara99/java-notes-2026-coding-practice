package com.imp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagrams {
	
	
	public static void main(String[] args) {
		String s="narendra dasara";
		String s1="dasara narendra";
		char[] charArray = s.toCharArray();
		char[] charArray2 = s1.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		System.out.println(Arrays.equals(charArray, charArray2));

		String collect1 = s1.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

		String collect = s.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
	System.out.println(collect.equals(collect1));	
	}
	
	
	

}
