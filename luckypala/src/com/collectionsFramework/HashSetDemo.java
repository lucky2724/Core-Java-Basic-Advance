package com.collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Set<Integer> hs = new HashSet<>();

		hs.add(63);
		hs.add(18);
		hs.add(12);
		hs.add(22);
		hs.add(35);
		hs.add(76);
		hs.add(2);
		hs.add(1);
		hs.add(2);
		
		System.out.println(hs);

	}
}
