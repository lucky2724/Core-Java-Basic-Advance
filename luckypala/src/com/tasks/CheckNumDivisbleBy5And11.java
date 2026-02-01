package com.tasks;

import java.util.Scanner;

public class CheckNumDivisbleBy5And11 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :  ");
		int n = sc.nextInt();

		if (n % 5 == 0 && n % 1 == 0) {
			System.out.println(n + " is Divisible By 5 and 11");
		} else {
			System.out.println(n + " is not Divisible By 5 and 11 ");
		}

		sc.close();
	}
}
