package com.collectionsex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employeee {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Narendra");
		map.put(102, "Ram");
		map.put(103, "Krishna");

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getValue() + "  " + e.getKey());
		}

		for (String v : map.values()) {
			System.out.println(v);
		}

		for (Integer i : map.keySet()) {
			System.out.println(i);
		}

		Iterator<String> iterator = map.values().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		map.forEach((k, v) -> System.out.println(k + ":" + v));

		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));

		map.entrySet().stream().filter(e -> e.getKey() <= 102).forEach(System.out::println);

	}

}
