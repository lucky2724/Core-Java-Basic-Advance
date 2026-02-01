package com.advancedConcepts;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionsDemo18 {
	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<>();

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
