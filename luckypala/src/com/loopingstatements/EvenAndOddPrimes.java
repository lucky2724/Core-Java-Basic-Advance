package com.loopingstatements;

import java.util.Scanner;

public class EvenAndOddPrimes {
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

	static void evenPrimes(int n) {
		System.out.println("Even Prime Numbers Upto : " + n);

		System.out.println(2);

		System.out.println("Only 2 is the even Prime Number !!");
		
		System.out.println("************************");
	}

	static void oddPimes(int n) {
		System.out.println("Odd Prime Numbers Upto : " + n);
		System.out.println("All primes are odd !! except 2 !!");

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("main method started ...");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number where we can print prime nums Even or Odd : ");
		int n = sc.nextInt();

		evenPrimes(n);

		oddPimes(n);
		
		sc.close();
	}
}
