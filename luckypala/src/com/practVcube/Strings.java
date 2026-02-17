package com.practVcube;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings {
	static boolean isSubSequence(String s, String t) {
		int sIndex = 0, tIndex = 0;

		while (sIndex < s.length() && tIndex < t.length()) {
			if (s.charAt(sIndex) == t.charAt(tIndex)) {
				sIndex++;
			}
			tIndex++;
		}
		return sIndex == s.length();
	}

	static char c(String s) {
		int[] freq = new int[256];

		for (char c : s.toCharArray())
			freq[c]++;

		for (char c : s.toCharArray()) {
			if (freq[c] == 1) {
				return c;
			}
		}

		return '\0';
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(10);
		System.out.println(al.size());

		System.out.println("----------------------");

		String password = new String("admin123");

		if (password == "admin123") {
			System.out.println("Login Success");
		} else {
			System.out.println("Failed");
		}

		System.out.println("----------------------");

		System.out.println(isSubSequence("abc", "ahbgdc"));

		System.out.println("----------------------");

		System.out.println(c("aabbc"));

		System.out.println("-------------------------------");

		Object obj = 34;

		if (obj instanceof Integer) {
			Integer num = (Integer) obj;
			System.out.println(num);
		} else {
			System.out.println("Obj is not an Integer..");
		}

		System.out.println("-------------------------------");

		String s1 = "evil";
		String s2 = "vile";

		char[] as1 = s1.toCharArray();
		char[] as2 = s2.toCharArray();

		Arrays.sort(as1);
		Arrays.sort(as2);

		if (Arrays.equals(as1, as2)) {
			System.out.println("Anagrams !!!");
		} else {
			System.out.println("Not Anagrams !!");
		}
	}
}
