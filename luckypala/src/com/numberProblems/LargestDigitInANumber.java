package com.numberProblems;

public class LargestDigitInANumber {
	static int largestDigit(int n) {
		int ans = Integer.MIN_VALUE;

		while (n > 0) {
			int digit = n % 10;
			ans = Math.max(ans, digit);
			n /= 10;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 71845;

		System.out.println(largestDigit(n));
	}
}
