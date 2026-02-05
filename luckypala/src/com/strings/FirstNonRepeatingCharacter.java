package com.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "hello h";

		Map<Character, Integer> hm = new HashMap<>();

		for (char ch : s.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		System.out.println(hm);

		// Using HashMap
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hm.get(ch) == 1) {
				System.out.println("First Non Repeating Character :" + ch);
				break;
			}
		}

		// Using Double for loop
		for (int i = 0; i < s.length(); i++) {
			boolean valid = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					valid = true;
				}
			}
			if (!valid) {
				System.out.println("First Non Repeating Character :" + s.charAt(i));
				break;
			}
		}

		// using firstIndex and lastIndex
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				System.out.println("First Non Repeating Character :" + ch);
				break;
			}
		}
	}
}
