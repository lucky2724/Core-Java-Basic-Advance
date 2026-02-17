package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");

		Collection<String> names = new ArrayList<>();

		names.add("Hardhik");
		names.add("Tilak");
		names.add("Abhishek");
		names.add("Sanju");
		names.add("Ishan");
		names.add("Varun");
		names.add("SKY");

		System.out.println(names);

		System.out.println("-----------------------");

//		for (String name : names) {
//			System.out.println(name);
//		}

		Iterator<String> itr = names.iterator();

//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			Thread.sleep(500);
//		}

		while (itr.hasNext()) {
			if (itr.next().equals("Varun")) {
				itr.remove();
			}
		}

		System.out.println("-----------------------");
		System.out.println(names);

	}
}
