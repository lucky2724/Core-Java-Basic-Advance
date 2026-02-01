package com.tasksarrays;

public class Rotate90Degrees {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = arr.length;
		int cols = arr[0].length;

		int ans[][] = new int[cols][rows];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				ans[j][rows - i - 1] = arr[i][j];
				// System.out.println(ar);
			}
		}

		for (int n1[] : ans) {
			for (int n : n1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
