package com.strings;

public class FirstRepeatingCharacter {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "Array";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (s.indexOf(ch) != s.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}
}
