package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
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

		Collection<Object> cl = new ArrayList<>();

		cl.add("Lucky");
		cl.add(10);
		cl.add(20);
		cl.add('A');
		cl.add(true);
		cl.add(40);
		cl.add(60);
		cl.add(25);

		System.out.println(cl);
	}
}
