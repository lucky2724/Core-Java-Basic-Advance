package com.collectionsFramework;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		SortedMap<Integer, String> sm = new TreeMap<>();

		sm.put(1, "Haii");
		sm.put(2, "Hello");
		sm.put(3, "Bye");

		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		System.out.println(sm.headMap(2));// <
		System.out.println(sm.tailMap(2));// =>

	}
}
