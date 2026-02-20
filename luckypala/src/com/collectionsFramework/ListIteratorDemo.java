package com.collectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.set(4, 50);
		list.set(2, 367);

		System.out.println(list);

		System.out.println("------------");

		ListIterator<Integer> litr = list.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("------------------");

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}
}
