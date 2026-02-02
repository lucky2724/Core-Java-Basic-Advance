package com.starpatterns;

public class LetterL {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
