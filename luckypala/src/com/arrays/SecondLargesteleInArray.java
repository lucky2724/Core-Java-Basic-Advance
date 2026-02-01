package com.arrays;

public class SecondLargesteleInArray {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 10, 20, 56, 30, 49, 26, 87, 24, 12,67 };

		int firstLarge = 0;
		int secondLarge = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = arr[i];
			} else if (secondLarge != firstLarge && arr[i] > secondLarge) {
				secondLarge = arr[i];
			}
		}

		System.out.println("first Large : " + firstLarge);
		System.out.println("second Large : " + secondLarge);
	}
}
