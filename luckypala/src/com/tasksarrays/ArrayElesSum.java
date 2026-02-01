package com.tasksarrays;

import java.util.Arrays;

public class ArrayElesSum {
	static int eleSum(int n) {
		int sum = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 23, 45, 93, 11, 21, 91 };

		int count = 0;

		int[] ans = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[i];
			count++;
		}

		for (int i = 0; i < arr.length; i++) {
			ans[count++] = eleSum(arr[i]);
		}

		System.out.println(Arrays.toString(ans));

	}
}
