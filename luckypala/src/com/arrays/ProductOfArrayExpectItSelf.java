package com.arrays;

import java.util.Arrays;

public class ProductOfArrayExpectItSelf {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 1, 2, 3, 4 };

		int result[] = new int[arr.length];

		result[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			result[i] = result[i - 1] * arr[i - 1];
		}

		int suffix = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			result[i] *= suffix;
			suffix *= arr[i];
		}
		
		System.out.println(Arrays.toString(result));
	}
}
