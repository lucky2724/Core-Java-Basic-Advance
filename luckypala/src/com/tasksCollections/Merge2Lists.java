package com.tasksCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Merge2Lists {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 4, 5 };

		Set<Integer> hs = new LinkedHashSet<>();

		for (int n : arr1) {
			hs.add(n);
		}

		for (int n : arr2) {
			hs.add(n);
		}

		System.out.println(hs);
	}
}
