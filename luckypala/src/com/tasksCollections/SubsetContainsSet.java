package com.tasksCollections;

import java.util.HashSet;
import java.util.Set;

public class SubsetContainsSet {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		System.out.println(set1);

		Set<Integer> set2 = new HashSet<>();

		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);

		System.out.println(set2);

		if (set1.containsAll(set2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
