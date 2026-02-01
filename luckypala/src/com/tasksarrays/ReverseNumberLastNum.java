package com.tasksarrays;

import java.util.Arrays;

public class ReverseNumberLastNum {
	public static void main(String[] args) {
		System.out.println("main method started...");

		int arr[] = { 35, 123, 567, 192, 973, 4673, 45679, 123456 };

		for (int i = 0; i < arr.length; i++) {
			int digit = arr[i] % 10;

			arr[i] /= 10;
			int n = Integer.toString(arr[i]).length();

			arr[i] = Math.powExact(10, n) * digit + arr[i];
		}

		System.out.println(Arrays.toString(arr));
	}
}
