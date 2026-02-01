package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo05 {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();
		c1.add("apple");
		c1.add("bag");
		System.out.println(c1.hashCode());
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("apple");
		c2.add("baag");
		System.out.println(c2.hashCode());

		System.out.println(c1.equals(c2));
		System.out.println("------------");
		System.out.println(c1.isEmpty());
	}
}
