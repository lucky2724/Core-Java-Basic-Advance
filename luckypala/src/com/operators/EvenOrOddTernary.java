package com.operators;

import java.util.Scanner;

public class EvenOrOddTernary {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		String ans = ((n & 1) == 0) ? " is Even " : " is Odd";
		System.out.println(n+"" +ans);
		sc.close();
	}
}
