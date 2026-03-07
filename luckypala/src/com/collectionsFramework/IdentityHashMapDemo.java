package com.collectionsFramework;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

//		Map<String, String> map = new HashMap<>();
		Map<String, String> map = new IdentityHashMap<>();

//		String s1 = "Sanju";
//		String s2 = "Sanju";
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));

		String s1 = new String("Sanju");
		String s2 = new String("Sanju");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		map.put(s1, "India");
		map.put(s2, "Kerala");

		System.out.println(map);

	}
}
