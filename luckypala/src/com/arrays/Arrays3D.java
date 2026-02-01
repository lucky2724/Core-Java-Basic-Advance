package com.arrays;

public class Arrays3D {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int[][][] arr = new int[3][3][3];

		arr[0][0][0] = 10;
		arr[1][1][1] = 20;
		arr[2][2][2] = 30;
		
		

		System.out.println("===== Using for-each  loop ======");
		for (int[][] n2 : arr) {
			for (int[] n1 : n2) {
				for (int n : n1) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("===== Using for loop ======");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
