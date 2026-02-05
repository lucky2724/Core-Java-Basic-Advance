package com.advancedConcepts;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionsDemo24 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String str = sc.nextLine();

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		System.out.println(hm);

		System.out.println("------------------------");

		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		sc.close();
	}
}
