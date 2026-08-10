package com.StreamEx;

import java.util.Random;
import java.util.stream.Stream;

public class Ex {
	
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(1,2,2,3);
		System.out.println(of.toList());
		
		Stream<Integer> stream = Stream.generate(()->10).limit(10);
		System.out.println(stream.toList());
		Stream<Integer> stream2 = Stream.generate(new Random()::nextInt).limit(10);
		System.out.println(stream2.toList());
		
		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(10);
		Stream<Integer> limit2 = Stream.iterate(0, n->n+1*1).limit(10);
		System.out.println(limit.toList());
		System.out.println(limit2.toList());

	}

}
