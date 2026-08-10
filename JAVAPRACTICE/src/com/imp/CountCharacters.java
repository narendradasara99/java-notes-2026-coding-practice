package com.imp;

import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) {
		String s = "narendra dasara";

		HashMap<Character, Integer> m = new HashMap<>();

		for (char c : s.toCharArray()) {

			m.put(c, m.getOrDefault(c, 0) + 1);

		}

		System.out.println(m);
	}

}
