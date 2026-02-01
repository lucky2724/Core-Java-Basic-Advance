package com.tasksarrays;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 2, 0, 4, 1, 0, 0, 5 };

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
