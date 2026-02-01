package com.advancedConcepts;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CollectionsDemo20 {
	public static void main(String[] args) {
		System.out.println("main method started");

		NavigableSet<Integer> ns = new TreeSet<>();

		ns.add(1000);
		ns.add(500);
		ns.add(700);
		ns.add(400);
		ns.add(600);
		ns.add(1200);
		ns.add(200);
		ns.add(100);

		System.out.println(ns);

		System.out.println(ns.floor(200));
		System.out.println(ns.ceiling(500));

		System.out.println(ns.higher(200));
		System.out.println(ns.lower(500));
	}
}
