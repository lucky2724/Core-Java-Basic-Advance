package com.tasksarrays;

public class NonDuplicateElements {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 3, 2, 4, 1, 8, 7, 1, 2, 3, 2,5,11,22 };

		System.out.println("Non-duplicate elements:");

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
