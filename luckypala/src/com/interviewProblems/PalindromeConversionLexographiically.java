package com.interviewProblems;

public class PalindromeConversionLexographiically {
	public static String convert(String s) {
		char[] arr = s.toCharArray();

		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			char minChar = (char) Math.min(arr[l], arr[r]);

			arr[l] = minChar;
			arr[r] = minChar;

			l++;
			r--;
		}

		return new String(arr);
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		System.out.println(convert("abca"));
		System.out.println(convert("race"));

	}
}
