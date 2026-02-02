package com.tasksarrays;

public class MatrixRotate90Degress {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = arr.length;
		int cols = arr[0].length;

		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[j][rows - i - 1] = arr[i][j];
				// System.out.print(arr[j][rows - i - 1] + " ");
			}
			// System.out.println();
		}

		for (int[] n : result) {
			for (int n1 : n) {
				System.out.print(n1 + " ");
			}
			System.out.println();
		}

	}
}
