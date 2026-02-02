package com.starpatterns;

public class LetterP {
	public static void main(String[] args) {
		// System.out.println("main method started..");
		System.out.println();

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n / 2 || (i <= n/2 && j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
