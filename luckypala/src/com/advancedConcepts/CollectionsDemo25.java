package com.advancedConcepts;

import java.util.IdentityHashMap;
import java.util.Map;

//IdentityHashMap Internally Working with == operator
//HashMap Internally Working with .equals() method
public class CollectionsDemo25 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Map<Object, String> map = new IdentityHashMap<>();

//		String s1 = "Java";
//		String s2 = "Java";

		String s1 = new String("Java ");
		String s2 = new String("Java ");

		map.put(s1, " is Diificult : ");
		map.put(s2, " is Simple : ");

		System.out.println(map);
	}
}
