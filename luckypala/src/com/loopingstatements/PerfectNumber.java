package com.loopingstatements;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("main method started..!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}

		System.out.println(" = " + n);

		if (sum == n) {
			System.out.println(n + " is perfect number !!");
		} else {
			System.out.println(n + " is not a perfect number !!");
		}

		sc.close();
	}
}
