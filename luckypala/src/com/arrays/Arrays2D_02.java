package com.arrays;

public class Arrays2D_02 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 8, 7 } };

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[2].length);
		System.out.println();

//		for (int[] n1 : arr) {
//			for (int n : n1) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
