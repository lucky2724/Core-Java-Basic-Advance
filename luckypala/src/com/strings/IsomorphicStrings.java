package com.strings;

public class IsomorphicStrings {
	static boolean isIsomorphic(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		int[] ls1 = new int[126];
		int[] ls2 = new int[126];

		for (int i = 0; i < s1.length(); i++) {
			if (ls1[s1.charAt(i)] != ls2[s2.charAt(i)]) {
				return false;
			}

			ls1[s1.charAt(i)] = i + 1;
			ls2[s2.charAt(i)] = i + 1;

		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println("maion method started");

		String s1 = "paper";
		String s2 = "title";

		System.out.println(isIsomorphic(s1, s2));

	}
}
