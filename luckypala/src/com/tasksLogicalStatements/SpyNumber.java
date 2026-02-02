package com.tasksLogicalStatements;

public class SpyNumber {
	static boolean isSpyNum(int n) {
		int sum = 0;
		int mul = 1;

		while (n > 0) {
			int digit = n % 10;
			sum += digit;
			mul *= digit;
			n /= 10;
		}

		return sum == mul;
	}

	public static void main(String[] args) {
		System.out.println("main method started...");

		int n = 1124
				;

		if (isSpyNum(n)) {
			System.out.println(n + " is a Spy Number !!");
		} else {
			System.out.println(n + " is not a Spy Number !!.0");
		}
	}
}
