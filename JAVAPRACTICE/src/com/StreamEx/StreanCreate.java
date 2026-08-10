package com.StreamEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreanCreate {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("naren", "yash", "rammy");

		Stream<String> stream = asList.stream().map(n->n.toUpperCase());
		System.out.println(stream.toList());
		
		ArrayList<List<Integer>> a = new ArrayList<>();
		a.add(Arrays.asList(1,2,3,34));
		a.add(Arrays.asList(2,3,4));
		a.add(Arrays.asList(1,2,3,340));
		
		List<Integer> list = a.stream().flatMap(m->m.stream()).toList();
		System.out.println(list);
		

			
	}

}
