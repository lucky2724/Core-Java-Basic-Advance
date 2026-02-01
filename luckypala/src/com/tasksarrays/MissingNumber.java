package com.tasksarrays;

import java.util.Arrays;

public class MissingNumber {
	static int missingNum(int[] arr) {
		boolean[] check = new boolean[arr.length + 2];

		for (int i : arr) {
			check[i] = true;
		}

		Arrays.sort(arr);

		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 7, 4, 6, 8, 5 };

		System.out.println(missingNum(arr));

	}
}
