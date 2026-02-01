package com.patterns;

public class SIRI {
	public static void main(String[] args) {
		System.out.println("main method started..");
		System.out.println();
		System.out.println();

		int n = 6;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n / 2 || i == n || (i < n/2 && j == 1) || (i > n/2 && j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n/2 || j == 1 || (j == n && i < n/2) || (i - j == 1 && i > n/2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n / 2 || i == n || (i < n/2 && j == 1) || (i > n/2 && j == n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 1; j <= n / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == 1 || i == n / 2 ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}
