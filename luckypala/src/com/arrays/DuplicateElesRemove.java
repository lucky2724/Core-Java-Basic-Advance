package com.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElesRemove {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3 };

		Set<Integer> hs = new LinkedHashSet<>();

		for (int num : arr) {
			hs.add(num);
		}

		System.out.println(hs);
	}
}
