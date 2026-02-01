package com.loopingstatements;

import java.util.Scanner;

public class MathTable {
	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a table value what you want : ");
		int n = sc.nextInt();
		System.out.println("Enter what you want upto the table : ");
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			System.out.println(i + " X " + n + " = " + i * n);
		}

		sc.close();

	}
}
