package com.arrays;

public class Arrays_2D {
	public static void main(String[] args) {
		System.out.println("main method started..");

		// Declaration
		int[][] nums = new int[3][4];

		// Initialization
		nums[0][0] = 10;
		nums[1][1] = 20;
		nums[2][2] = 30;

		// Using for each loop
		for (int[] n1 : nums) {
			for (int n : n1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		// using for loop
		System.out.println();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}
}
