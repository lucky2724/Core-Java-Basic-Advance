package com.casestudy;

import java.util.Arrays;

public class RootateElementsinArray {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = arr.length;

		k = k % n;

		int result[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i <= k) {
				result[i] = arr[n + i - k - 1];
			} else {
				result[i] = arr[i - k - 1];
			}
		}

		System.out.println(Arrays.toString(result));

	}
}
