package com.patterns;

public class LetterZ {
	public static void main(String[] args) {
		System.out.println();

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i == 1 || i == n ||  (j-i==0)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
