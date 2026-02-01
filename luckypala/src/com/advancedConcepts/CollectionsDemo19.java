package com.advancedConcepts;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsDemo19 {
	public static void main(String[] args) {
		System.out.println("main method started");

		SortedSet<Integer> ss = new TreeSet<>();

		ss.add(10);
		ss.add(30);
		ss.add(3);
		ss.add(27);
		ss.add(54);
		ss.add(10);
		ss.add(30);
		ss.add(3);
		ss.add(27);
		ss.add(54);
		ss.add(60);
		ss.add(13);
		ss.add(57);
//		ss.add("Java");
//		ss.add("HTML");
//		ss.add("SQL");

		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(3));
		System.out.println(ss.tailSet(30));
		System.out.println(ss.subSet(10, 30));

		System.out.println(ss.reversed());

		Employee5 e1 = new Employee5(1, "Lucky", 65000, 23, 77887766599L);
		Employee5 e2 = new Employee5(2, "Surya", 60000, 25, 99887766599L);
		Employee5 e3 = new Employee5(3, "Ram", 85000, 26, 887766599L);
		Employee5 e4 = new Employee5(4, "Srinu", 90000, 21, 67887766599L);
		Employee5 e5 = new Employee5(5, "Shiva", 45000, 20, 797887766599L);
		Employee5 e6 = new Employee5(6, "Raju", 25000, 20, 87887766599L);

		SortedSet<Employee5> se = new TreeSet<>();
		se.add(e1);
		se.add(e2);
		se.add(e3);
		se.add(e4);
		se.add(e5);
		se.add(e6);

		System.out.println(se); // ClassCastException
	}
}
