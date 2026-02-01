package com.tasksarrays;

import java.util.Arrays;

public class ProductItSelfArray {
	static int productOfArray(int arr[]) {
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			} else {
				prod *= arr[i];
			}
		}
		return prod;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 1, 0, 3, 4 };

		int n = arr.length;

		int ans[] = new int[n];

		System.out.println(productOfArray(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				ans[i] = 0;
			} else {
				ans[i] = productOfArray(arr) / arr[i];
			}
		}

		System.out.println(Arrays.toString(ans));
	}
}
