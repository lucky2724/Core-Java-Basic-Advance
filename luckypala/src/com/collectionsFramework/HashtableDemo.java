package com.collectionsFramework;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

//		Map<String, String> country = new HashMap<>();
		Map<String, String> country = new Hashtable<>();

		country.put("IN", "India");
		country.put("US", "United States");
		country.put("UK", "United Kingdom");
		country.put("AU", "Australia");
		country.put(null, null);
		country.put(null, "Hello");
		country.put("Hey", null);

		System.out.println(country);
	}
}
