package com.tasksLogicalStatements;

import java.util.Scanner;

public class PrimeAndItsFactors {
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void factors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		System.out.print("Factors of " + n + " are : ");
		factors(n);

		if (isPrime(n)) {
			System.out.println(n + " is Prime number !!");
		} else {
			System.out.println(n + " is Composite number !!");
		}

		sc.close();

	}
}
