package com.advancedConcepts;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDemo16 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> al = new CopyOnWriteArrayList<>();

		al.add(10);
		al.add(5);
		al.add(100);
		al.add(20);

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			al.add(50);
		}

		System.out.println("-------------------");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			// al.add(10); infinty loop
		}

		System.out.println(al);
	}
}
