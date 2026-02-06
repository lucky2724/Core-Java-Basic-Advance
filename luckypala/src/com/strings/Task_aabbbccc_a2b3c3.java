package com.strings;

public class Task_aabbbccc_a2b3c3 {
	public static void main(String[] args) {
		String s = "abbbccceeeefffffffffffffffg";

		String ans = "";

		for (int i = 0; i < s.length(); i++) {

			int count = 1;

			ans += s.charAt(i);

			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}

			ans += count;

		}

		System.out.println(ans);
	}
}
