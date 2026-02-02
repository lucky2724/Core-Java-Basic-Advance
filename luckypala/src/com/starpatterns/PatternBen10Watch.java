package com.starpatterns;

public class PatternBen10Watch {
	public static void main(String[] args) {
		System.out.println("main method started..");
		int n = 6;

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k =0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
