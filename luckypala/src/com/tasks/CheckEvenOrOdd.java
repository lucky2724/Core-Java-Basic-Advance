package com.tasks;

import java.util.Scanner;

public class CheckEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if ((n & 1) == 0) {
			System.out.println(n + " is Even number");
		} else {
			System.out.println(n + " is Odd Number");
		}

		sc.close();
	}
}
