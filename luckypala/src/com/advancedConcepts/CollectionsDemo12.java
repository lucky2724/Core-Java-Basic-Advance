package com.advancedConcepts;

import java.util.LinkedList;

public class CollectionsDemo12 {
	public static void main(String[] args) {
		System.out.println("main mmethod started");

		LinkedList<Integer> al = new LinkedList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(null);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(null);

		System.out.println(al);
		System.out.println(al.size());
	}
}
