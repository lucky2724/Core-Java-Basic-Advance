package com.loopingstatements;

public class PrimeFactors {
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

	static void primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) && n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started !!!");

		int n = 18;

		primeFactors(n);

	}
}
