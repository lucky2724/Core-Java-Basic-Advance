package com.loopingstatements;

import java.util.Scanner;

public class MathTableUsingMethod {
	static void mathTable(int n, int r) {
		for (int i = 1; i <= r; i++) {
			System.out.println(i + " X " + n + " = " + i * n);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number what you want table : ");
		int n = sc.nextInt();

		System.out.println("Enter a number upto print : ");
		int r = sc.nextInt();

		mathTable(n, r);

		sc.close();
	}
}
