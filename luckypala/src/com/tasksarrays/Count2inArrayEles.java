package com.tasksarrays;

public class Count2inArrayEles {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 122, 212, 312, 422 };
		int ele = 2;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > 0) {
				int digit = arr[i] % 10;
				arr[i] /= 10;

				if (digit == ele) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
