package com.collectionsFramework;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {

		System.out.println("main method started");

		List<Integer> al = new CopyOnWriteArrayList<>();

		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		// java.util.ConcurrentModificationException
		for (Integer i : al) {
			System.out.println(i);
			al.add(8);
		}

//		Iterator<Integer> itr = al.iterator();
//
		// FailFast-->java.util.ConcurrentModificationException
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add(7);
//		}

		System.out.println(al);

		List<Integer> l = new CopyOnWriteArrayList<>();

		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);

		Iterator<Integer> itr2 = l.iterator();

		// FailSafe
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			l.add(7);
		}

		System.out.println(l);

	}
}
