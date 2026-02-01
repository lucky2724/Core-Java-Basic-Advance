package com.patterns;

public class LetterV {
	public static void main(String[] args) {
		int n = 6;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n; j++) {
				if (j == i || j == (2 * n - i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
