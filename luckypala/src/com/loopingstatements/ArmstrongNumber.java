package com.loopingstatements;

import java.util.Scanner;

public class ArmstrongNumber {
	static boolean armStrong(int n) {
		int temp = n;
		int digits = Integer.toString(n).length();
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, digits);
			n /= 10;
		}

		return sum == temp;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		int n = sc.nextInt();

		if (armStrong(n)) {
			System.out.println(n + " is Armstrong Number !!");
		} else {
			System.out.println(n + " is not Armstrong !!");
		}

		sc.close();
	}
}
