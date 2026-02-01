package com.loopingstatements;

public class NonPrimeNums {
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	static void printNonPrimeNums(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (!isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Non prime Nums : " + count);
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");

		printNonPrimeNums(100);
	}
}
