package com.collectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteratingDemo {
	public static void main(String[] args) {

		System.out.println("main method started");

		Map<Integer, String> map = new HashMap<>();

		map.put(18, "Virat");
		map.put(7, "Thala");
		map.put(7, "Luckyy");
		map.put(33, "Hardhik");
		map.put(9, "Sanju");
		map.put(45, "HITMAN");
		map.put(63, "SKY");

		System.out.println(map);

		System.out.println("----- First way ------------");
		Set<Entry<Integer, String>> entries = map.entrySet();
		System.out.println(entries);
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			// or System.out.println(entry);
		}

		System.out.println("----- Second way ------------");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("----- Third way ------------");
		for (Integer i : map.keySet()) {
			System.out.println(i + " -> " + map.get(i));
		}
		
		System.out.println("----- Using Java 8 ------------");
		map.forEach((key,value)->
			System.out.println(key+" -> "+value)
			);
	}
}
