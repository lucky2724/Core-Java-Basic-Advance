package com.patterns;

public class LetterR {
	public static void main(String[] args) {
		// System.out.println("main method startedd..");
		System.out.println();

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n / 2 || (i - j == 1 && i > n / 2) || (i <= 3 && j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
