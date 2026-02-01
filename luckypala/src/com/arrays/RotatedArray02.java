package com.arrays;

import java.util.Arrays;

public class RotatedArray02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] ans = new int[arr.length];

		int n = arr.length;

		int r = 4;
		r = r % n;

		for (int i = 0; i < arr.length; i++) {
			if (i < r) {
				ans[i] = arr[n - r + i];
			} else {
				ans[i] = arr[i - r];
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}
}
