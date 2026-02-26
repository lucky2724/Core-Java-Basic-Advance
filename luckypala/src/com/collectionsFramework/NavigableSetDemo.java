package com.collectionsFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		NavigableSet<Integer> ns = new TreeSet<>();

		ns.add(12);
		ns.add(15);
		ns.add(14);
		ns.add(16);
		ns.add(11);
		ns.add(10);

		System.out.println(ns.ceiling(13));// >=
		System.out.println(ns.floor(13));// <=

		System.out.println("-----------");
		System.out.println(ns.ceiling(15));// <=
		System.out.println(ns.floor(16));// >=

		System.out.println("-----------");
		System.out.println(ns.higher(10));// >
		System.out.println(ns.lower(13));// <

		System.out.println("-----------");
		System.out.println(ns.higher(15));// >
		System.out.println(ns.lower(16));// <

		System.out.println(ns);
	}
}
