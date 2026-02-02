package com.interviewProblems;

public class Rotate90DegreesMatrix {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = arr.length;
		int cols = arr[0].length;

		int ans[][] = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				//System.out.print(ans[j][i] + " ");
				ans[j][rows - i - 1] = arr[i][j];
			}
			//System.out.println();
		}

		System.out.println();

		for (int a[] : ans) {
			for (int a1 : a) {
				System.out.print(a1 + " ");
			}
			System.out.println();
		}

	}
}
