package com.StreamEx;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamEx {

	public static void main(String[] args) {

		String s = "my name is narendra";

		// 🔥 1️⃣ Count Occurrence of Each Character (Case Sensitive)
		
		Arrays.asList(s.split("")).stream().peek(n->System.out.println(n)).forEach(System.out::println);

		Map<String, Long> collect = Arrays.asList(s.split("")).stream()
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect);

		// 🔥 2️⃣ Find First Non-Repeating Character

		String string = Arrays.asList(s.split("")).stream()
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(m -> m.getKey()).findFirst().get();
		System.out.println(string);

		// 🔥 2️⃣ Find First Repeating Character

		String string2 = Arrays.asList(s.split("")).stream()
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(m -> m.getKey()).findFirst().get();
		System.out.println(string2);

		// 🔥 3️⃣ Find Duplicate Characters

		Set<String> collect2 = Arrays.asList(s.split("")).stream()
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(m -> m.getKey()).collect(Collectors.toSet());
		System.out.println(collect2);

		// 🔥 4️⃣ Reverse Each Word in Sentence

		String collect3 = Arrays.stream(s.split(" ")).map(m -> new StringBuffer(m).reverse())
				.collect(Collectors.joining());
		System.out.println(collect3);

		// 🔥 6️⃣ Sort Characters Alphabetically

		String collect4 = Arrays.stream(s.split("")).sorted().distinct(). collect(Collectors.joining());
		System.out.println(collect4);
		
		
		//11️⃣ Check if string contains only digits
		boolean allMatch = s.chars().allMatch(Character::isDigit);
		System.out.println(allMatch);
		
		
		
	}

}
