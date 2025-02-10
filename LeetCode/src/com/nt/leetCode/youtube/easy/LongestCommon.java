package com.nt.leetCode.youtube.easy;

import java.util.Arrays;

public class LongestCommon {

	public static String common(String str[]) {

		String str_1 = str[0];

		String str_2 = str[str.length - 1];

		int index = 0;

// now sort the array so we can compare the first and the last element in the array

		Arrays.sort(str);

		// now its sort , u can compare the first and last element .

		while (index < str.length - 1) {

			if (str_1.charAt(index) == str_2.charAt(index)) {

				index++;

			} else {
				break;
			}

		}

		return index == 0 ? "" : str_1.substring(0, index);
	}

	public static void main(String[] args) {

		String str[] = { "flower", "flow", "flight" };

		System.out.println(common(str));

	}
}
