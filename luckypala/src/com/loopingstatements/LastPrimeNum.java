package com.loopingstatements;

import java.util.Scanner;

public class LastPrimeNum {
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

	static int lastPrime(int n) {
		int lastPrime = -1;
		for (int i = n; i >= 2; i--) {
			if (isPrime(i)) {
				lastPrime = i;
				break;
			}
		}
		return lastPrime;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a  number : ");
		int n = sc.nextInt();

		if (lastPrime(n) != -1) {
			System.out.println("last Prime num : " + lastPrime(n));
		} else {
			System.out.println("No prime are found !!");
		}

		sc.close();
	}
}
