package com.strings;

public class CountVowels {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "Java is simple";

		int vowels = 0;
		int consonants = 0;

		s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				if (ch != ' ') {
					consonants++;
				}
			}
		}

		System.out.println("Vowels : " + vowels);

		System.out.println("Consonants : " + consonants);
	}
}
