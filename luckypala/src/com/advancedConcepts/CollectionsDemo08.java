package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsDemo08 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<String> li = new ArrayList<>();

		li.add("J2SE");
		li.add("J2EE");
		li.add("DAO");
		li.add("FRAMEWORKS");
		li.add("UI");
		li.add("SPRING");
		li.add("SPRING BOOT");
		li.add("UI");

		Iterator<String> itr = li.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("*********************");
		ListIterator<String> litr = li.listIterator();

		// top->bottom
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("*******************");

		// botttom -> top
		while (litr.hasPrevious()) { // ;
			System.out.println(litr.previous());
		}

	}
}
