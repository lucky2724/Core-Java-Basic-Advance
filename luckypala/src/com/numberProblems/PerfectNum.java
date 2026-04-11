package com.numberProblems;

public class PerfectNum {
	static boolean isPerfect(int n) {
		int sum = 1;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				sum += i;

				if (n / i != i) {
					sum += n / i;
				}
			}
		}

		return sum == n;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 28;

		if (isPerfect(n)) {
			System.out.println(n + " is A perfect Number");
		} else {
			System.out.println(n + " is not a Perfect Number");
		}
	}
}
