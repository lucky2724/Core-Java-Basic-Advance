package com.strings;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String s = sc.nextLine();

		String rev = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			rev = ch + rev;
		}

		System.out.println(rev);

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("Not Palindrome");
		}

		sc.close();
	}
}
