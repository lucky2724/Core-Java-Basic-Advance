package com.tasksarrays;

public class TransposeMatrix {
	public static void main(String[] args) {
		System.out.println("main method  started..");

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = arr.length;
		int cols = arr[0].length;

		int transpose[][] = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[j][i] + " ");
				transpose[j][i] = arr[i][j];
			}
			System.out.println();
		}

		System.out.println();
		
		for (int n1[] : transpose) {
			for (int n : n1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
