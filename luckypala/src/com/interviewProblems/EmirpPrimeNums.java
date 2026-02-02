package com.interviewProblems;

public class EmirpPrimeNums {

	// Check if a number is prime
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// Reverse a number
	static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int N = 10; // Number of emirp numbers to print
		int count = 0;
		int num = 2; // Start checking from 2

		System.out.println("First " + N + " Emirp numbers:");

		while (count < N) {
			if (isPrime(num)) {
				int rev = reverse(num);

				// Check if reversed number is prime AND not a palindrome
				if (rev != num && isPrime(rev)) {
					System.out.print(num + " ");
					count++;
				}
			}
			num++;
		}
	}

}
