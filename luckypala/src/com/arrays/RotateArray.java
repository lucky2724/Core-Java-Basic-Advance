package com.arrays;

import java.util.Scanner;

public class RotateArray {
	static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	static void rotatedArray(int arr[], int r) {

		int n = arr.length;

		r = r % n;

		// step 1:reverse the given array
		reverse(arr, 0, n - 1);

		// step 2:reverse half based on r value
		reverse(arr, 0, r - 1);

		// step 3:reverse the second half based on r value
		reverse(arr, r, n - 1);

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Enter how many time rotated array ..");
		int r = sc.nextInt();

		rotatedArray(arr, r);

		for (int a : arr) {
			System.out.print(a + " ");
		}
		
		sc.close();

	}
}
