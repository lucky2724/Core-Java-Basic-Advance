package com.interviewProblems;

public class ReverseAString {
	static String revString(String s) {
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

		String rev = new String(ch);

		return rev;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "hello";

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}

		System.out.println("Original String : " + s);
		System.out.println("Reversed String : " + rev);
		System.out.println("Reversed String : " + revString(s));

	}
}
