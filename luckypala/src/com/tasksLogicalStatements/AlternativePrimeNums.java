package com.tasksLogicalStatements;

import java.util.Scanner;

public class AlternativePrimeNums {
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

	static void alternatePrimeNums(int n) {
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
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number up to print Alternative prime nums : ");
		int n = sc.nextInt();

		alternatePrimeNums(n);

		sc.close();

	}
}
