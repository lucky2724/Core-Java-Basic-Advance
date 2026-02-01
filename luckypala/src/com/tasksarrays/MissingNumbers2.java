package com.tasksarrays;

import java.util.Arrays;

public class MissingNumbers2 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 1, 3, 5, 8 ,14};

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			while (diff > 1) {
				System.out.print(arr[i]+1+" ");
				diff--;
				arr[i]++;
			}
		}

	}
}
