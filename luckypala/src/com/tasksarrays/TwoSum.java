package com.tasksarrays;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9, 8 };
		int target = 10;

		Arrays.sort(arr);

		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			int sum = arr[l] + arr[r];

			if (sum == target) {
				System.out.println(arr[l] + " " + arr[r]);
				break;
			} else if (sum > target) {
				r--;
			} else {
				l++;
			}
		}

	}
}
