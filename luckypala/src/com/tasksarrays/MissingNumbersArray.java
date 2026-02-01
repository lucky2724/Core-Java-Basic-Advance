package com.tasksarrays;

public class MissingNumbersArray {

	static int maxNum(int[] arr) {
		int max = 0;
		for (int num : arr) {
			max = Math.max(num, max);
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int[] arr = { 1, 7, 3, 9, 5, 14 };

		int max = maxNum(arr);

		for (int i = 1; i <= max; i++) {
			boolean valid = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					valid = true;
					break;
				}
			}
			if (!valid) {
				System.out.print(i + " ");
			}
		}
	}
}
