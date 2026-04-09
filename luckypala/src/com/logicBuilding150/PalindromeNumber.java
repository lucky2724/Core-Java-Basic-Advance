package com.logicBuilding150;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("main method started...");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int temp = n;
		int rev = 0;

		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}

		System.out.println("Reveresed Number is : " + rev);

		if (temp == rev) {
			System.out.println(temp + " is a Pallindrome Number !!");
		} else {
			System.out.println(temp + " is Not palindrome !!");
		}

		sc.close();
	}
}
