package com.patterns;

public class LetterJ {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == n / 2 + 1 || (j < 4 && i == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
