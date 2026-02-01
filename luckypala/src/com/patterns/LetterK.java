package com.patterns;

public class LetterK {
	public static void main(String[] args) {
		int n = 7; // total rows

		for (int i = 1; i <= n; i++) {

			// printing first vertical line
			System.out.print("* ");

			// printing diagonal slashes
			for (int j = 1; j <= n; j++) {
				if (j == Math.abs(n / 2 -i+1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}
