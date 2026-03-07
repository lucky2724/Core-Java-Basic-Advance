package com.collectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(9, "Sanju");
		map.put(7, "MSD");
		map.put(18, "Virat");
		map.put(45, "Rohit");
		map.put(8, "Jaddu");
		
		System.out.println(map);
	}
}
