package com.numberProblems;

public class CheckForPrimeNumber {
	static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started..!!");

		int n = 13;

		if (isPrime(n)) {
			System.out.println(n + " is Prime ");
		} else {
			System.out.println(n + " is not Prime");
		}
	}
}
