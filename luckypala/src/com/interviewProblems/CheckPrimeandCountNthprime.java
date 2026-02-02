package com.interviewProblems;

public class CheckPrimeandCountNthprime {
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

		int n = 11;

		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}

		if (isPrime(n)) {
			System.out.println(n + " is a Prime number ");
			System.out.println(n + " is " + count + " th prime number !!");
		} else {
			System.out.println(n + " is not a prime number ");
		}
	}
}
