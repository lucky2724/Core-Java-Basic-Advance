package com.arrays;

public class Arrays2D_03 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		//Jagged Array
		int[][] n = new int[2][];

		n[0] = new int[2];

		n[1] = new int[3];

		for (int[] n1 : n) {
			for (int n2 : n1) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}
	}
}
