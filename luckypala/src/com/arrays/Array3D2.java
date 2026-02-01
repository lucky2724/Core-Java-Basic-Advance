package com.arrays;

public class Array3D2 {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[][][] arr = { { { 1, 3, 2, 3 }, { 3, 4, 5, 5 }, { 6, 5, 7, 8 }, { 10, 6, 2, 4 } },
				{ { 3, 4, 5 }, { 1, 2, 3 }, { 5, 2, 3 } }, { { 1, 2 }, { 3, 4 }, { 4, 5 }, { 9, 0 } },
				{ { 3, 4 }, { 2, 3 } } };

		for (int n2[][] : arr) {
			for (int n1[] : n2) {
				for (int n : n1) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
