package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<Object> c = new ArrayList<>();

		c.add(50);
		c.add("Cummins");
		c.add('A');
		c.add(190.6);
		c.add(true);

		System.out.println(c);
	}
}
