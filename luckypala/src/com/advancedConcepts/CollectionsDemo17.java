package com.advancedConcepts;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo17 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Set<Integer> s = new HashSet<>();

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(20);
		s.add(70);
		s.add(32);
		s.add(17);
		s.add(null);
		s.add(null);
		s.add(null);

		System.out.println(s);

	}
}
