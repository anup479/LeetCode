package com.nt.oneOneZero.Day_2;

public class SecondLargestElement {

	public static int second_Largest(int[] name) {

		int first, second;

		if (name[0] > name[1]) {
			first = name[0];
			second = name[1];
		} else {
			first = name[1];
			second = name[0];
		}

		// in the same way we have to iterate rest of the code .

		for (int i = 2; i < name.length; i++) {

			if (name[i] > first) {
				second = first;
				first = name[i];

			} else if (name[i] < first && name[i] > second) {

				second = name[i];
			}

		}

		return second;
	}

}
