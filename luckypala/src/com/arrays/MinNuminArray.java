package com.arrays;

public class MinNuminArray {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 3, 5, -4,2, 1, 9,0 };

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
