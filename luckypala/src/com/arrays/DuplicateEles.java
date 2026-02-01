package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEles {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 1, 2, 3, 4, 5, 2, 3, 1, 1, 2, 3 };

		Set<Integer> hs = new HashSet<>();

		for (int a : arr) {
			if (!hs.add(a)) {
				System.out.println(hs);
				break;
			}
		}
	}
}
