package com.arrays;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		System.out.println("main method started...!");

		int arr[] = { 10, 20, 30, 40, 50, 60 };

		// Using for loop
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println();
		System.out.println();

		// using while loop
		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;

			l++;
			r--;
		}

		System.out.println(Arrays.toString(arr));
	}
}
