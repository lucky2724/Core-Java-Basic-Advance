package com.loopingstatements;

import java.util.Scanner;

public class SumOfGivenNumber {
	static int sumOfDigits(int n) {
		int sum = 0;

		while (n != 0) {
			int digit = n % 10;
			sum += digit;
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started..!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		System.out.println(sumOfDigits(n));

		sc.close();
	}
}
