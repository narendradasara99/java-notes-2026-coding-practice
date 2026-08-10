package com.imp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
	
	public static void main(String[] args) {
	String s1="naren dasara sreeRamya yashna";
	
	
	
	String first="";
	String second="";
	
	for(String c:s1.split(" ")) {
		if(first.length()<c.length()) {
			second=first;
			first=c;
		}else if(second.length()<c.length()) {
			second=c;
		}
		
	}
	System.out.println(second);
	
	
	
	
	}
}
