package com.wrapper;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Ex {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		int x=10;
		Integer y=Integer.valueOf(x);
		int intValue = y.intValue();
		System.out.println(x);
		System.out.println(y);
		
		String s="20";
		
		int int1 = Integer.parseInt(s);
		Integer int2 = Integer.valueOf(s);
		System.out.println(int1);
		System.out.println(int2);
		
		
		String valueOf = String.valueOf(int1);
		String string = Integer.toString(int1);
		System.out.println(valueOf);
		System.out.println(string);
		
		
		System.out.println("------------------");
		
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(10);
		q.add(20);
		q.add(10);
		q.add(5);
		
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		


	}

}
