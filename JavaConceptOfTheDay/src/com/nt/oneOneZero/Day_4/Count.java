package com.nt.oneOneZero.Day_4;

import java.util.HashMap;

public class Count {

//	How To Count Occurrences Of Each Character In String In Java?

	public static void count_up(String inputString) {

		HashMap<Character, Integer> hashMap = new HashMap<>();

		char[] charArray = inputString.toCharArray();

		for (char c : charArray) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}
		}

		System.out.println(inputString + ":" + hashMap);
	}

	public static void main(String[] args) {

		count_up("HEllo world ");
		count_up("All is well");

	}

}
