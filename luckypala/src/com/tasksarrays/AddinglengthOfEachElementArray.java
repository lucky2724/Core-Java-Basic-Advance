package com.tasksarrays;

import java.util.Arrays;

public class AddinglengthOfEachElementArray {
	static int count(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int[] arr = { 25, 2, 226, 1, 8, 46,987654 };

		for (int i = 0; i < arr.length; i++) {
			// int len = Integer.toString(arr[i]).length();

			int len = count(arr[i]);

			arr[i] = arr[i] * 10 + len;
		}

		// System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(arr));

	}
}
