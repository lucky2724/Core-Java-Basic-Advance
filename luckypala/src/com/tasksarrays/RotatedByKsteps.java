package com.tasksarrays;

import java.util.Arrays;

public class RotatedByKsteps {
	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method strated..");

		int[] arr = { 20, 60, 90, 30, 40 };

		int k = 2;

		int n = arr.length;

		reverse(arr, 0, n - 1);

		reverse(arr, 0, k);

		reverse(arr, k+1, n - 1);

		System.out.println(Arrays.toString(arr));

	}
}
