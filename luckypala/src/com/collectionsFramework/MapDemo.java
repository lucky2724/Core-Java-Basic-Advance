package com.collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Map<Integer, String> map = new HashMap<>();

		map.put(18, "Virat");
		map.put(7, "Thala");
		map.put(7, "Luckyy");
		map.put(33, "Hardhik");
		map.put(9, "Sanju");
		map.put(1, "KL");
		map.put(45, "HITMAN");
		map.put(8, "Jaddu");
		map.put(63, "SKY");

		// System.out.println(map.put(45, "Lucky")); Hitman Because it takes prev val

		System.out.println(map.put(77, "Gill"));// null //No prev val
		System.out.println(map.put(77, "Iyer")); // Gill

		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);

	}
}
