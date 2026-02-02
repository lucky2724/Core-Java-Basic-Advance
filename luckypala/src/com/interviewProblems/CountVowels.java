package com.interviewProblems;

public class CountVowels {
	static int countVowels(String s) {
		s = s.toLowerCase();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		String s = "hello world";

		System.out.println("Number of vowels : " + countVowels(s));
	}
}
