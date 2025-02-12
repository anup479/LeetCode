package com.nt.leetCode.youtube.easy;
//s = "A man, a plan, a canal: Panama"

//Output: true

//Explanation: "amanaplanacanalpanama" is a palindrome.

public class ValidPalindrome {

	public boolean isPalindrome(String s) {

		StringBuffer sb = new StringBuffer();

		// try convert the String in to low case!

		for (int i = 0; i < s.length(); i++) {

			// convert in to chart

			char charAt = s.charAt(i);

			if (Character.isLetter(charAt) || Character.isDigit(charAt)) {
				sb.append(charAt);
			}

			String string = sb.toString();
			string = string.toLowerCase();
			if (checkPalindrome(string)) {
				return true;
			}

		}

		return false;
	}

	public static boolean checkPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;

	}

}
