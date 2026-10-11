package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class B {
	public static void main(String[] args) {
		String s = "narendra";
		
		for(char c:s.toCharArray()) {
			if("AEIOUaeiou".indexOf(c)!=-1) {
				System.out.println(c);
			}
		}
		
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();
		
		for(char c: s.toCharArray()) {
			
			m.put(c,m.getOrDefault(c,0)+1);
		}
		
		System.out.println(m);
		
		for(Character c:m.keySet()) {
			
			if(m.get(c)>1) {
				System.out.println(c);
				break;
			}
			
		}
		
		
		String l="my name is narendra dasara my";
		
		String[] split = l.split(" ");
		String first="";
		String second="";
		for(String lon:split) {
			if(lon.length()>first.length()) {
				second=first;
				first=lon;
				
			}else if(lon.length()>second.length()) {
				
				second=lon;
				
			}
			
			
		}System.out.println("second "+second);
		
		
		
		
		Arrays.stream(l.split(" ")).map(sub->sub.substring(0, 1).toUpperCase()+sub.substring(1)).forEach(System.out::println);
		
        int[] arr = {11,0,0,15,0,7,2};

        int target = 9;
        
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int num:arr) {
        	int diff=target-num;
        	if(hashSet.contains(diff)) {
        		  System.out.println(diff + " " + num);
        	}
        	hashSet.add(num);
        }
        
        int[] ar = {1,0,2,0,3};

        int index = 0;

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i] != 0)
            {
                ar[index++] = ar[i];
            }
        }

        while(index < ar.length)
        {
            arr[index++] = 0;
        }

        for(int num : ar)
            System.out.print(num+" ");
    }

        
        
        
        

	

}
