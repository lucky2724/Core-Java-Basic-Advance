package com.tasksCollections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEles {

	int[] arr = { 1, 7, 3, 6, 5, 6 };

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 9, 1, 9, 3, 2 };

		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int n : arr) {
			if (!seen.add(n)) { // if already present
				duplicates.add(n);
			}
		}

		System.out.println("Duplicates: " + duplicates);
	}
}
