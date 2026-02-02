package com.starpatterns;

public class ILOVEYOU {
	public static void main(String[] args) {
		System.out.println();

		int n = 8;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter I
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n; j++) {
				System.out.print(" ");
			}

			// Letter L
			for (int j = 1; j <= n; j++) {
				if (i == n || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter O
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter V
			for (int j = 0; j < 2 * n; j++) {
				if (j == i || j == (2 * n - i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter E
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || i == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n; j++) {
				System.out.print(" ");
			}

			// Letter U
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
