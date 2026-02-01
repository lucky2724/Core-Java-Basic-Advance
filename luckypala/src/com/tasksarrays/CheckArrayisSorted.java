package com.tasksarrays;

public class CheckArrayisSorted {
	static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 27, 29, 31, 2 };

		System.out.println(isSorted(arr));

	}
}
