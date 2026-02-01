package com.arrays;

import java.util.Arrays;

public class RotatedArray {
	static int[] reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k =137;
		k = k % arr.length;
		int n = arr.length - 1;

		System.out.println(Arrays.toString(reverse(arr, 0, n)));
		System.out.println();

		System.out.println(Arrays.toString(reverse(arr, 0, k - 1)));
		System.out.println();

		System.out.println(Arrays.toString(reverse(arr, k, n)));

	}
}
