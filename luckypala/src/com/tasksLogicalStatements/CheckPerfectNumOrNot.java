package com.tasksLogicalStatements;

import java.util.Scanner;

public class CheckPerfectNumOrNot {
	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started..!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (isPerfect(n)) {
			System.out.println(n + " is a perfect number !!");
		} else {
			System.out.println(n + " is not a perfect number !!");

		}

		for (int i = 1; i <= 1000; i++) {
			if (isPerfect(i)) {
				System.out.print(i +" ");
			}
		}
		sc.close();
	}
}
