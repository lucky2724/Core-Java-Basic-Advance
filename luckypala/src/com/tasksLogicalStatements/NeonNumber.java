package com.tasksLogicalStatements;

public class NeonNumber {
	static boolean isNeon(int n) {
		int square = n * n;
		int sum = 0;

		while (square > 0) {
			sum += square % 10;
			square /= 10;
		}
		return sum == n;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int n =9;

		if (isNeon(n)) {
			System.out.println(n + " is a Neon Number !!");
		} else {
			System.out.println(n + " is a Not a Neon !!");
		}

	}
}
