package com.tasks2ls;

public class Pattern111121133114641 {
	public static void main(String[] args) {
		System.out.println("main method started..");

//		1
//	   1  1
//	  1 2 1
//	 1 3 3 1
//	1 4 6 4 1

		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(num + " ");
				num = num * (i - k) / (k + 1);
			}
			System.out.println();
			
		}
	}
}
