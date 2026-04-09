package com.Problems;

public class StrongNumber {
	static int factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method started...");

		int n = 145;
		int temp = n;
		int ans = 0;

		while (n > 0) {
			int digit = n % 10;
			ans += factorial(digit);
			n /= 10;
		}

		System.out.println(ans);

		if (ans == temp) {
			System.out.println(temp + " is a Strong Number !!");
		} else {
			System.out.println("Not a Strong Number !!");
		}
	}
}
