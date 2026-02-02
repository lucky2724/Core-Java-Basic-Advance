package com.interviewProblems;

public class DigitSum {
	static int digitSum(int n) {
		while (n > 9) {
			int ans = 0;
			while (n > 0) {
				ans += n % 10;
				n /= 10;
			}
			n = ans;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int n = 987;

		System.out.println(digitSum(n));
	}
}
