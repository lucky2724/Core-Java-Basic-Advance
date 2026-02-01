package com.loopingstatements;

import java.util.Scanner;

public class DecimalToBinary {
	static String decimalToBinary(int n) {
		return Integer.toBinaryString(n);
	}

	static void decimalToBinary2(int n) {
		String rev = " ";
		int temp=n;
		while (n > 0) {
			int digit = n % 2;
			rev = digit + rev;
			n /= 2;
		}

		System.out.println(temp + " ->  " + rev);
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number !!");
		int n = sc.nextInt();

		System.out.println(n + " ->  " + decimalToBinary(n));

		decimalToBinary2(n);

		sc.close();
	}
}
