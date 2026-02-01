package com.loopingstatements;

import java.util.Scanner;

public class FactorsUsingMethod {
	static void factors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
	 			System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		factors(n);

		sc.close();
	}
}
