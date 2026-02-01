package com.arrays;

public class MaxNumInArray {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 3, 9, 15, 6, 1, };

		int max = 0;

		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		
		System.out.println("Maximum number in Array : "+max);
	}
}
