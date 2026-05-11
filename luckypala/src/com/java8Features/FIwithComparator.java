package com.java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FIwithComparator {
	public static void main(String[] args) {
		System.out.println("main method started");

		ArrayList<Integer> al = new ArrayList<>();

		al.add(76);
		al.add(10);
		al.add(80);
		al.add(65);
		al.add(45);
		al.add(32);
		al.add(93);
		al.add(23);

		System.out.println(al);

		Comparator<Integer> c = (o1, o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;

		Collections.sort(al, c);

		System.out.println(al);

	}
}
