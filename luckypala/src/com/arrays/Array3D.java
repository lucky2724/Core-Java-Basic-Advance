package com.arrays;

public class Array3D {
	public static void main(String[] args) {
		System.out.println("main method shtarted..");

		int[][][] arr = new int[3][3][3];

		// First Pos
		arr[0][0][0] = 10;
		arr[0][1][1] = 20;
		arr[0][2][2] = 30;

		// Second Pos
		arr[1][0][0] = 10;
		arr[1][1][1] = 20;
		arr[1][2][2] = 30;

		// thirdPos
		arr[2][0][0] = 10;
		arr[2][1][1] = 20;
		arr[2][2][2] = 30;

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
