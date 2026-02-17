package com.advancedConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsDemo09 {
	public static void main(String[] args) {

		List<String> veggies = new ArrayList<>();

		veggies.add("Tomato");
		veggies.add("Potato");
		veggies.add("Carrot");
		veggies.add("Brinjal");
		veggies.add("DrumSticks");
		veggies.add("Banana");
		veggies.add("Orange");

//		System.out.println(veggies.get(2));

		List<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("PineApple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");

		veggies.retainAll(fruits);

		System.out.println(fruits);
		System.out.println(veggies);

		System.out.println("-----------Using for loop -----------------");

		for (int i = 0; i < veggies.size(); i++) {
			System.out.println(veggies.get(i));
		}

		System.out.println("----------Using for each ------------------");

		for (String veg : veggies) {
			System.out.println(veg);
		}

		System.out.println("------------ Using Iterator ----------------");

		ListIterator<String> litr = veggies.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
	}
}
