package com.nt.oneOneZero.Day_1;

public class ReverseString {

	public static String reverse(String name) {
		// convert the String in toChar Array.
		char[] charArray = name.toCharArray();

		// reverse the String using using whileLoop

		int left = 0;
		int right = charArray.length - 1;

		while (left <= right) {

			// swiping code

			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;

			left++;
			right--;
		}

		String ss = new String(charArray);
		return ss;
	}

	public static void main(String[] args) {

		String name = "Hello world";

		System.out.println(reverse(name));
	}
}
