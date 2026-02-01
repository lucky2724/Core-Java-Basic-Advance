package com.array2dprblms;

public class MatrixDiagonalSumOptimal {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int n = arr.length;

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i][i];
			if (i != n - i - 1) {
				sum += arr[i][n - i - 1];
			}
		}
		
		System.out.println(sum);
	}
}
