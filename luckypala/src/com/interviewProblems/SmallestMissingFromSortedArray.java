package com.interviewProblems;

import java.util.Arrays;

public class SmallestMissingFromSortedArray {
	public static void main(String[] args) {
		System.out.println();

		int arr[] = { 2, -3, 4, 1, 1, 7 };

		for (int i = 0; i < arr.length - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > 0 && arr[i + 1] > 0) {
				if (arr[i + 1] - arr[i] > 1) {
					System.out.println(arr[i] + 1);
					break;
				}
			}
		}

	}
}
