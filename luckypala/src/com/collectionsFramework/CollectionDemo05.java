package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo05 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Avacado");
		fruits.add("carrot");

		Collection<String> veggies = new ArrayList<>();
		veggies.add("Brinjal");
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("Banana");
		veggies.add("Carrot");
		veggies.add("onion");

		fruits.retainAll(veggies);

		System.out.println(fruits);
		System.out.println(veggies);

		System.out.println(fruits.size());
		System.out.println(veggies.size());

	}
}
