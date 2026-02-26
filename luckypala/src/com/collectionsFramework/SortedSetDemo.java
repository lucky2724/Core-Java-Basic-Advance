package com.collectionsFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Integer> ls = new TreeSet<>();

		ls.add(102);
		ls.add(243);
		ls.add(53);
		ls.add(64);
		ls.add(185);
		ls.add(53);
		ls.add(64);

		System.out.println("first : " + ls.first());
		System.out.println("Last : " + ls.last());

		System.out.println("first : " + ls.getFirst());
		System.out.println("Last : " + ls.getLast());

		System.out.println("-------------------");

		System.out.println(ls.subSet(50, 65));

		System.out.println("-------------------");

		System.out.println("headSet : " + ls.headSet(64));
		System.out.println("headSet : " + ls.headSet(60));

		System.out.println("tailSet : " + ls.tailSet(64));
		System.out.println("tailSet : " + ls.tailSet(60));
		
		System.out.println(ls.reversed());

		System.out.println(ls);
	}
}
