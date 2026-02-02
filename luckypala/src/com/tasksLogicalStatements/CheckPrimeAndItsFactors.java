package com.tasksLogicalStatements;

public class CheckPrimeAndItsFactors {
	public static void main(String[] args) {
		System.out.println("main method started !!");

		int n = 23;

		int count = 0;

		System.out.print("factors Of "+n+" are : ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println();

		if (count == 2) {
			System.out.println(n + " is Prime Number !!");
		} else {
			System.out.println(n + " is a Composite Number !!");
		}
	}
}
