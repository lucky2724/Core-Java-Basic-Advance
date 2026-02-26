package com.collectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Set<Integer> ls = new LinkedHashSet<>();

		ls.add(102);
		ls.add(243);
		ls.add(53);
		ls.add(64);
		ls.add(185);
		ls.add(53);
		ls.add(64);

		System.out.println(ls);

	}
}
