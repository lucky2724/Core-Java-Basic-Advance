package com.strings;

import java.util.Scanner;

public class ReverseAString {
	static String reverse(String s) {
		char[] ch = s.toCharArray();

		int l = 0;
		int r = ch.length - 1;

		while (l < r) {
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;

			l++;
			r--;
		}

		return new String(ch);
	}

	// Using for loop

	static String reverse2(String s) {
		if (s == null || s.length() <= 1)
			return s;

		char[] ch = s.toCharArray();

		for (int l = 0, r = ch.length - 1; l < r; l++, r--) {
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String  : ");
		String s = sc.nextLine();

		System.out.println("Reverse String : " + reverse(s));
		System.out.println("Reverse String : " + reverse2(s));

		sc.close();
	}
}
