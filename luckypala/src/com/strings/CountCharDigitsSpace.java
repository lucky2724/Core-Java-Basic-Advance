package com.strings;

import java.util.Scanner;

public class CountCharDigitsSpace {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String s = sc.nextLine();

		s = s.toLowerCase();

		int charCount = 0;
		int vowelCount = 0;
		int consCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int misCharCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isAlphabetic(ch)) {
				charCount++;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consCount++;
				}
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else if (Character.isSpaceChar(ch)) {
				spaceCount++;
			} else {
				misCharCount++;
			}
		}

		System.out.println("Total String length : " + s.length());
		System.out.println("Character Count : " + charCount);
		System.out.println("Vowels Count : " + vowelCount);
		System.out.println("Consonants Count : " + consCount);
		System.out.println("Digit Count : " + digitCount);
		System.out.println("Space Count : " + spaceCount);
		System.out.println("Mis linear Chars : " + misCharCount);

		sc.close();
	}
}
