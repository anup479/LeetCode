package com.nt.oneOneZero.Day_4;

import java.util.HashMap;
import java.util.Map;

public class CountEight {

	public static void main(String[] args) {

		String input = "Java 8 Streams ";

		Map<Character, Integer> map = new HashMap<>();
		map.merge(null, null, null);

		input.chars().mapToObj(c -> (char) c).forEach(c -> map.merge(c, 1, Integer::sum));
		System.out.println(map);

	}
}
