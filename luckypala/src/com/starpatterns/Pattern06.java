package com.starpatterns;

public class Pattern06 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
