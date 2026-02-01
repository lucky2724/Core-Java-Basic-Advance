package com.loopingstatements;

import java.util.Scanner;

public class PrimeNumbersPrint {
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

	static void primeNumbers(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Prime Nums : " + count);
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to print numbers : ");
		int n = sc.nextInt();

		primeNumbers(n);

		sc.close();
	}
}
