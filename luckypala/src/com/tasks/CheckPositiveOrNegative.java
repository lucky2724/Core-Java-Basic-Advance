package com.tasks;

import java.util.Scanner;

public class CheckPositiveOrNegative {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println(n + " is Positive number..");
		} else {
			System.out.println(n + " is Negative numberr..");
		}

		sc.close();
	}
}
