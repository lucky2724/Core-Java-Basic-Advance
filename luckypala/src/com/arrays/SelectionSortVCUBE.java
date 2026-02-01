package com.arrays;

import java.util.Arrays;

public class SelectionSortVCUBE {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 50, 40, 10, 20, 5, 30,8,57 };

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
}
