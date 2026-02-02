package com.interviewProblems;

import java.util.Arrays;

public class RotatedArrayByKSteps {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 2, 3, 4, 5 };

		int shifts = 7;

		shifts = shifts % arr.length;

		int ans[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i < shifts) {
				// System.out.print(arr[arr.length + i - shifts] + " ");
				ans[i] = arr[arr.length + i - shifts];
			} else {
				// System.out.print(arr[i - shifts] + " ");
				ans[i] = arr[i - shifts];
			}
		}

		System.out.println(Arrays.toString(ans));
	}
}
