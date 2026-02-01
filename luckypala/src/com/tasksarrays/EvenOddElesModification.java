package com.tasksarrays;

import java.util.Arrays;

public class EvenOddElesModification {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 3, 10, 7, 9, 15, 25 };

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = arr[i] * arr[i];
			} else {
				arr[i] = 2 * arr[i];
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
