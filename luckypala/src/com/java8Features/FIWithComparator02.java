package com.java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FIWithComparator02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> al = Arrays.asList(10, 46, 13, 37, 2, 49, 19);

		System.out.println(al);

		Comparator<Integer> c = (o1, o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;

		Collections.sort(al, c);

		System.out.println(al);
	}
}
