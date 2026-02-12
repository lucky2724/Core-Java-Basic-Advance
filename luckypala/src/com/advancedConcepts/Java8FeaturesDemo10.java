package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Java8FeaturesDemo10 {
	public static void main(String[] args) {
		System.out.println("main method started");

		ArrayList<Integer> al = new ArrayList<>();

		al.add(20);
		al.add(10);
		al.add(25);
		al.add(5);
		al.add(30);
		al.add(0);
		al.add(15);

		System.out.println("Before : " + al);

		// Collections.sort(al);
		Comparator<Integer> c1 = (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;

		Collections.sort(al, c1);

		System.out.println("After : " + al);
	}
}
