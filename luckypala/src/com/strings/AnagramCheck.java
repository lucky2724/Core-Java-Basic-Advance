package com.strings;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramCheck {

	// Using HashMap
	static boolean isAnagram1(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : s1.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		for (char c : s2.toCharArray()) {
			if (!map.containsKey(c))
				return false;

			map.put(c, map.get(c) - 1);

			if (map.get(c) == 0)
				map.remove(c);
		}

		return map.isEmpty();
	}

	// using sort
	static boolean isAnagram2(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
	}

	static boolean isAnagram(String s1, String s2) {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length())
			return false;

		int[] count = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}

		for (int i : count)
			if (i != 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		String s1 = "listen";
		String s2 = "silent";

		System.out.println("HashMap : " + isAnagram1(s1, s2));
		System.out.println("Sort : " + isAnagram2(s1, s2));
		System.out.println("Array : " + isAnagram(s1, s2));
	}
}
