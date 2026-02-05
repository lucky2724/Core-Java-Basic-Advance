package com.advancedConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsDemo23 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Map<Object, Object> m = new HashMap<>();

		m.put(7, "Thala");
		m.put(18, "Virat");
		m.put(45, "Hitman");
		m.put("Csk", "Chennai");
		m.put("Rcb", "Benguluru");
		m.put("SRK", "Hyd");

		System.out.println(m);
		System.out.println("-------------------------");

		Map<Integer, String> hm = new HashMap<>();

		hm.put(7, "Thala");
		hm.put(18, "Virat");
		hm.put(45, "Hitman");
		hm.put(30, "Luckyy");
		// hm.put(30, "surya");

		System.out.println(hm.keySet());
		System.out.println(hm.values());

		hm.replace(45, "Rohith Sharma");
		System.out.println(hm.remove(30));
		Set<Entry<Integer, String>> entries = hm.entrySet();

		System.out.println("--------------------------");
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("--------------------------");

		System.out.println(m.put(30, "Cummins"));
		System.out.println(m.put(30, "SRIKANTH"));
		System.out.println(m.put(30, "Lakshman Pala"));

		System.out.println(hm);

		System.out.println(hm.containsKey(20));
		System.out.println(hm.containsKey(45));

		System.out.println(hm.containsValue("Virat"));

	}
}
