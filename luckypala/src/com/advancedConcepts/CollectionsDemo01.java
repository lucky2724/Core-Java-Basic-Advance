package com.advancedConcepts;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionsDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<Integer> c = new ArrayList<>();

		System.out.println(c.add(101));
		c.add(102);
		c.add(105);
		c.add(103);
		c.add(104);
		c.add(101);
		c.add(106);
		c.add(100);
		c.add(106);
		c.add(null);
		c.add(null);
		c.add(null);

		System.out.println(c);

	}
}
