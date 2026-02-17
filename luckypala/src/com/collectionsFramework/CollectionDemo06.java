package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo06 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<Integer> cl = new ArrayList<>();

		cl.add(10);
		cl.add(20);
		cl.add(30);
		cl.add(40);
		cl.add(50);

		System.out.println(cl);

		Object[] arr = cl.toArray();

		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

	}
}
