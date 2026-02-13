package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Practice {
	public static void main(String[] args) {
		System.out.println("main method started");

//		Collection cl = new ArrayList();
//
//		cl.add("Lucky");
//		cl.add(34);
//		cl.add(true);
//		cl.add(10.45);
//		cl.add('A');
//
//		System.out.println(cl);

		Collection<Integer> cl = new ArrayList<>();

		cl.add(34);
		cl.add(10);
		cl.add(38);
		cl.add(96);
		cl.add(45);

		System.out.println(cl);

	}
}
