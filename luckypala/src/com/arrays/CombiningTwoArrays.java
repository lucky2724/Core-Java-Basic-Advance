package com.arrays;

import java.util.Arrays;

public class CombiningTwoArrays {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60, 70 };

		int combArray[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			combArray[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			combArray[i + a.length] = b[i];
		}

		System.out.println(Arrays.toString(combArray));
	}
}
