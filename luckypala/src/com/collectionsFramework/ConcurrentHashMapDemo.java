package com.collectionsFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Map<String, String> map = new ConcurrentHashMap<>();

		map.put("AP", "AndhraPradesh");
		map.put("AP", "Andhra Pradesh");
		map.put("TS", "Telangana");
		map.put("KA", "Karnataka");
		map.put("TN", "Tamil Nadu");
		map.put("KL", "Kerala");
		

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			map.put("IN", "India");
		}

		System.out.println(map);
	}
}
