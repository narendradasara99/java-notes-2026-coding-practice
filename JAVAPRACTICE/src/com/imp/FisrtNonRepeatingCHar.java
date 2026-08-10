package com.imp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FisrtNonRepeatingCHar {
	
	public static void main(String[] args) {

		String s="narendra";
		
		LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
		
		for(char c:s.toCharArray()) {
			linkedHashMap.put(c, linkedHashMap.getOrDefault(c, 0)+1);
		}
		
		for(char c:linkedHashMap.keySet()) {
			if(linkedHashMap.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
		
String list = Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting() )).entrySet().stream().filter(e->e.getValue()==1).map(k->k.getKey()).findFirst().get();		
		
System.out.println(list);
		
		
	}
	
	

}
