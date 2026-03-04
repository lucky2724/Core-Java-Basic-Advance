package com.collectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String s = sc.nextLine();

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		char maxChar = ' ';
		int max = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		System.out.println("Highest Frequency: " + maxChar + " -> " + max);

		System.out.println(map);

		// For better Praactice
//		for (char ch : s.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//
//		System.out.println(map);

		sc.close();
	}
}
