package com.arrays;

public class Arrays3D2 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[][][] = { { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 6, 7, 8, 9 } },
				{ { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 }, { 5, 6, 7 } }, 
				{ { 3, 4, }, { 1, 2 }, { 6, 7 } },
				{ { 9, 0 }, { 7, 8 } } };

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
