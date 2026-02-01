package com.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;

		int result[] = new int[n];

		result[0] = 1;

		// prefix product
		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1];
			System.out.println(result[i]);
		}

		System.out.println();

		// suffix product
		int suffix = 1;

		for (int i = n - 1; i >= 0; i--) {
			result[i] *= suffix;
			suffix *= nums[i];
			System.out.println(result[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		int arr[] = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(productExceptSelf(arr)));
	}
}
