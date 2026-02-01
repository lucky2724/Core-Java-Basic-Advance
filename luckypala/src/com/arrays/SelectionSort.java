package com.arrays;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 2, 4, 5, 7, 3, 1, 5, 0, 66, -6, -1 };

		for (int i = 0; i < arr.length - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}

			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;

		}

		System.out.println(Arrays.toString(arr));

	}
}
