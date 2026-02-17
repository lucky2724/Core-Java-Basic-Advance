package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo04 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<String> seniors = new ArrayList<>();
		seniors.add("MSD");
		seniors.add("Virat");
		seniors.add("Rohit");
		seniors.add("Sachin");
		seniors.add("Boomrah");

		Collection<String> juniors = new ArrayList<>();

		juniors.add("Hardhik");
		juniors.add("Tilak");
		juniors.add("Abhishek");
		juniors.add("Sanju");
		juniors.add("Ishan");
		juniors.add("Varun");
		juniors.add("SKY");

		juniors.remove("Ishan");

		System.out.println(juniors);

		Collection<String> cricketers = new ArrayList<>();

		cricketers.addAll(juniors);
		cricketers.addAll(seniors);

		cricketers.removeAll(seniors);

		cricketers.removeIf((s -> s.contains("shek")));

		System.out.println(cricketers);
	}
}
