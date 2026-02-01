package com.tasksarrays;

import java.util.Arrays;

public class ArraysanddigitsSum {
	static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 123, 143, 157, 193, 117 };

		String[] ans = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[i] + "" + sumOfDigits(arr[i]);

			int sum = sumOfDigits(arr[i]);

			int digits = String.valueOf(sum).length();

			int val = (int) Math.pow(10, digits);

			arr[i] = (arr[i] * val) + sum;
		}

		System.out.println(Arrays.toString(ans));

		System.out.println(Arrays.toString(arr));
	}
}
