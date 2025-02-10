package com.nt.oneOneZero.Day_2;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChacters {

	public static void dupli(String name) {

		// create HashMap
		HashMap<Character, Integer> hashMap = new HashMap<>();

		// now create

		// now creeate the String into char

		char[] charArray = name.toCharArray();

		for (char c : charArray) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}
		}

		// now get the keys .
		Set<Character> keySet = hashMap.keySet();

		System.out.println("duplicate characters in a string " + name);

		// iterating throught Set
		for (Character cc : keySet) {
			if (hashMap.get(cc) > 1) {
				System.out.println(cc + " :" + hashMap.get(cc));

			}

		}

	}

	public static void main(String[] args) {
		dupli("Hard Work ");
		dupli("do u have what it takes ..");
	}
}
