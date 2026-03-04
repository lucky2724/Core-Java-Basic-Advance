package com.tasksCollections;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "hello hai nge";

		Map<Character, Integer> hm = new HashMap<>();

		for (char ch : s.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		for (char ch : s.toCharArray()) {
			if (hm.get(ch) == 1) {
				System.out.println(ch);
				return;
			}
		}

		System.out.println("No non repeating Character Found !!");

	}
}
