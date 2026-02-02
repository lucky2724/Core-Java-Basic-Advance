package com.starpatterns;

public class Array2D {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int rows = arr.length;
		int cols = arr[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i % 2 == 0) {
					int rev = arr[i][(arr[i].length - 1) - j];

					if (i == j) {
						System.out.print(rev * rev + "  ");
					} else {
						System.out.print(rev + "  ");
					}

				} else {
					int doub = arr[i][j] *2;
					if (i == j) {
						System.out.print(doub * doub + "  ");
					} else {
						System.out.print(arr[i][j] * 2 + "  ");
					}
				}

			}
			System.out.println();
		}
	}
}
