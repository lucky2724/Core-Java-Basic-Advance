package com.tasks;

import java.util.Scanner;

public class EvenOrOddUsingTernary {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		String result = ((n & 1) == 0) ? "Even" : "Odd";
		System.out.println(n + " is " + result);

		sc.close();

	}
}
