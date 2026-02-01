package com.loopingstatements;

import java.util.Scanner;

public class NthPrimeNumber {
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

	static int nthPrime(int n) {
		int count = 0;
		int num = 2;

		if (n <= 0) {
			return 0;
		}

		while (true) {
			if (isPrime(num)) {
				count++;

				if (count == n) {
					break;
				}
			}
			num++;
		}

		return num;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N to find N th number : ");
		int n = sc.nextInt();

		int ans = nthPrime(n);

		System.out.println(ans);

		sc.close();

	}
}
