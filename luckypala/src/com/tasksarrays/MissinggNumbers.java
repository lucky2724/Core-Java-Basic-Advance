package com.tasksarrays;

import java.util.Arrays;

public class MissinggNumbers {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 5, 8, 1, 3 };

		Arrays.sort(arr);

		for (int i = 1; i < arr[arr.length - 1]; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			}
		}

	}
}
