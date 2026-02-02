package com.interviewProblems;

public class FirstNprimeNumsreverseAlsoPrime {
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

	static int reverse(int n) {
		int rev = 0;

		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("mainn method started");

		int n = 10;

		int count = 0;

		int num = 2;

		while (count < n) {
			if (isPrime(num)) {
				int rev = reverse(num);

				if ((isPrime(rev))) {
					System.out.print(num + " ");
					count++;
				}
			}
			num++;
		}

	}
}
