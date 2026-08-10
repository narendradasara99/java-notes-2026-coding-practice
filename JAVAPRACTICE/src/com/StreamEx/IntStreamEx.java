package com.StreamEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		a.add(1);
		a.add(0, 9);
		a.addFirst(2);
		
		int n[]= {1,2,3,4,27,56};
		
		List asList = Arrays.asList(n);

		//🔥 1️⃣ IntStream vs Stream<Integer>
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		Stream.of(1,2,3,5,3).forEach(System.out::println);
		
		//🔥 2️⃣ Convert List<Integer> → IntStream
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		IntStream mapToInt = list.stream().mapToInt(Integer::intValue);
		
		//🔥 3️⃣ Convert IntStream → Stream<Integer>
		
		Stream<Integer> boxed = IntStream.range(1, 10).boxed();
		
		// Find Second Largest Number
		
		Integer integer = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println("second largest"+integer);
		
		//2️⃣ Sum of Even Numbers
		
		int sum = list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
		
		
		//
		
		

	}

}
