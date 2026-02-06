package com.advancedConcepts;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsDemo27 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Map<String, String> m = new ConcurrentHashMap<>();

		m.put("J2SE", "Core Java");
		m.put("J2EE", "Advance Java");
		m.put("Frameworks", "Spring SpringBoot and Micro Services");
		m.put("DAO", "JDBC,Hibernate & JPA");

		System.out.println(m);

		System.out.println("-------------------------");

		for (Map.Entry<String, String> entry : m.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
			m.put("UI", "HTML,CSS,JS,REACT");
		}

		System.out.println(m);
	}
}
