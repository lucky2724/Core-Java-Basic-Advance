package com.arrays;

public class SecondSmallestEleinArray {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 36, 49, 12, 43, 90, 65 };

		int firstSmall = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstSmall) {
				secondSmall = firstSmall;
				firstSmall = arr[i];
			} else if (secondSmall != firstSmall && arr[i] < secondSmall) {
				secondSmall = arr[i];
			}
		}

		System.out.println("first Small : " + firstSmall);
		System.out.println("Second Small : " + secondSmall);

	}
}
