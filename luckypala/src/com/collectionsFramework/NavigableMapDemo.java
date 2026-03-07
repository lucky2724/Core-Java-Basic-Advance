package com.collectionsFramework;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		NavigableMap<Integer, String> sm = new TreeMap<>();

		sm.put(1, "Haii");
		sm.put(2, "Hello");
		sm.put(3, "Bye");

		System.out.println(sm.ceilingKey(-2));// >=
		System.out.println(sm.floorKey(9));// <=
		
		
	}
}
