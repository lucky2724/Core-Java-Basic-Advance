package com.tasksLogicalStatements;

public class Diamond {
	public static void main(String[] args) {
		System.out.println("main methood started..");

		int n = 4;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = n -2; i >= 0; i--) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
