package com.strings;

public class AddtwoChars {
	public static void main(String[] args) {
		// Input : hello world
		// ans 1: heo rl ans 2:llwod

		String s = "hello World";

		String ans1 = "";
		String ans2 = "";

		for (int i = 0; i < s.length();) {
			for (int k = 0; k < 2 && i < s.length(); i++, k++) {
				ans1 = ans1 + s.charAt(i);
			}
			for (int k = 0; k < 2 && i < s.length(); i++, k++) {
				ans2 = ans2 + s.charAt(i);
			}
		}

		System.out.println(ans1);
		System.out.println(ans2);
	}
}
