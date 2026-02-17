package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<Float> c1 = new ArrayList<>();

		// c1.add(10); can't convert int to Float
		c1.add(5.9F);
		c1.add(5.8F);
		c1.add(5.5F);

		System.out.println(c1.hashCode());
		System.out.println(c1);

		Collection<Float> c2 = new ArrayList<>();

		// c1.add(10); can't convert int to Float
		c2.add(5.9F);
		c2.add(5.8F);
		c2.add(5.5F);

		System.out.println(c2.hashCode());
		System.out.println(c2);

		System.out.println(c1.equals(c2));

		System.out.println("---------------");
		System.out.println(!c1.isEmpty());
		System.out.println(c2.isEmpty());
	}
}
