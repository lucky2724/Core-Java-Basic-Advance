package com.arrays;

public class MinAndMaxInArray {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 10, 15, 36, 45, -10, -60 };

		int min = arr[0];
		int max = arr[0];

		for (int num : arr) {
			if (num < min) {
				min = num;
			} else if (num > max) {
				max = num;
			}
		}

		System.out.println("Min value : " + min);
		System.out.println("max Value : " + max);
	}
}
