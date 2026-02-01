package com.loopingstatements;

public class AlterNativePrimeNums {
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

	static void alternativePrimes(int n) {
		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				count++;
				if (count % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 100;

		alternativePrimes(n);
	}
}
