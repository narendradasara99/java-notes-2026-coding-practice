package com.collectionsex;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.add(1);
		s.add(20);
		s.add(200);
		s.add(34);
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);


	}

}
