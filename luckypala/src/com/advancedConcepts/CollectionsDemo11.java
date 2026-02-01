package com.advancedConcepts;

import java.util.ArrayList;

public class CollectionsDemo11 {
	public static void main(String[] args) {
		System.out.println("main method started");

		ArrayList<Integer> al = new ArrayList<Integer>();

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
