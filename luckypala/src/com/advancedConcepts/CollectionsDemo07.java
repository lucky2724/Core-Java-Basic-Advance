package com.advancedConcepts;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo07 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(18);
		al.add(45);
		al.add(7);
		al.add(8);
		al.add(1);
		al.add(77);
		al.add(98);
		al.add(1, 55);
		al.add(2, 88);

		System.out.println(al.get(3));
		System.out.println(al.set(3, 15));
		System.out.println(al.get(3));

		System.out.println(al.remove(4));
		System.out.println(al.remove(al.indexOf(98)));

		List<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(2, 10);
		al1.addAll(al);

		System.out.println(al1);
		System.out.println(al);

	}
}
