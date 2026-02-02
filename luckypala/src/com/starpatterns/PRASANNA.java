package com.starpatterns;

public class PRASANNA {
	public static void main(String[] args) {
		System.out.println();
		System.out.println();

		int n = 8;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter P
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n / 2 || (i <= n / 2 && j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter R
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n / 2 || (i - j == 1 && i > n / 2) || (i <= 3 && j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter A
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || j == n || i == n / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter S
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || i == n / 2 || (i <= n / 2 && j == 1) || (i >= n / 2 && j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter A
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || j == n || i == n / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter N
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Letter N
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || j == n || i == n / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
