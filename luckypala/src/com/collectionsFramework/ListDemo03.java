package com.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<String> names = new ArrayList<>();

		// Hardhik Abhishek SKY Ishan Dube Rinku Tilak washing
		names.add("SKY");
		names.add(1, "Ishan");
		names.add(2, "Tilak");
		names.add(0, "Abhishek");
		names.add(0, "Hardhik");
		names.add(4, "Dube");
		names.add("Washinton");
		names.add(5, "Rinku");
//		names.add("Varun");
//		names.add("Arshdeep");
//		names.add("Akshar");	
//		names.add("Boomra");
//		names.add("Kuldeep");
//		names.add("Sanju");
//		names.add("Siraj");

		names.remove(0);
		names.remove("Dube");
		System.out.println(names);
	}
}
