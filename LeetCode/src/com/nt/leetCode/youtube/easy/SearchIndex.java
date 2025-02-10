package com.nt.leetCode.youtube.easy;

public class SearchIndex {

	public static int Search_Index(int[] nums, int target) {

		// int a[] = { 1, 2, 3, 4, 5 };

		// now we have to go through out binary search , middle search ...
		// find the first and last of the array ..

		int first = 0;
		int last = nums.length - 1;

		// now start the while loop.

		while (first <= last) {

			// find the middle of an array ..
			int mid = (first + last) / 2;

			// now loop the array ..

			if (nums[mid] == target) {

				return mid;
			} else if (nums[mid] > target) {

				last = mid - 1;
			} else {
				first = mid + 1;
			}

		}

		return first;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 7 };
		int target = 0;

		System.out.println("---");
		System.out.println(Search_Index(nums, target));

	}
}