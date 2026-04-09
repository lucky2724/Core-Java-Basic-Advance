package com.Problems;

public class PerfectNumber {
	static int divisorsSum(int n) {
		int sum = 0;
		for (int i = 1; i <=n/2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		int n = 28;

		int ans = divisorsSum(n);

		if (ans == n) {
			System.out.println(n + " is Perfect Number !! ");
		} else {
			System.out.println(n + " is Not perfect Number !!");
		}

	}
}
