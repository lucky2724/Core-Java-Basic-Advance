package com.loopingstatements;

import java.util.Scanner;

public class FibonacciSeries {

	static void fibonacci(int n) {
		int a = 0;
		int b = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many numbers in your fibonacci Series ...");
		int n = sc.nextInt();

		fibonacci(n);

		sc.close();
	}
}
