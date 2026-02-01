package com.practVcube;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number how many iterations you want..");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}

		sc.close();
	}
}
