package com.loopingstatements;

import java.util.Scanner;

public class ReverseAnumber {
	static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		return rev;
	}

	static boolean palindrome(int n) {
		int rev = 0;
		int temp = n;

		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}

		return rev == temp;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		System.out.println("Reverse number : " + reverse(n));

		if (palindrome(n)) {
			System.out.println(n + " is  Palindrome !!");
		} else {
			System.out.println(n + " is not Palindrome !!");
		}

		sc.close();

	}

}
