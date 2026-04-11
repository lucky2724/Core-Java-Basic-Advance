package com.numberProblems;

public class CountOfPrimeNumstillN {
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
		System.out.println("main method started..");
		int n = 10;

		int count = 0;

		System.out.println(isPrime(7));

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println();
		System.out.println(count);
	}
}
