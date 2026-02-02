package com.interviewProblems;

public class SecondLargestNum {
	static int secondLarge(int arr[]) {
		int firstLarge = 0;
		int secondLarge = 0;

		for (int i = 0; i < arr.length; i++) {
			if (firstLarge < arr[i]) {
				secondLarge = firstLarge;
				firstLarge = arr[i];
			} else if (secondLarge != firstLarge && secondLarge < arr[i]) {
				secondLarge = arr[i];
			}
		}
		return secondLarge;
	}

	public static void main(String[] args) {
		System.out.println("main method started...");

		int[] arr = { 10, 57, 20, 4, 45, 99 };

		System.out.println(secondLarge(arr));

	}
}
