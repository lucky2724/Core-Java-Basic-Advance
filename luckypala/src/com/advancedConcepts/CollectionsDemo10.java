package com.advancedConcepts;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo10 {
	public static void main(String[] args) {
		System.out.println("main methos started");

		List<String> veggies = new ArrayList<>();

		veggies.add("Tomato");
		veggies.add("Potato");
		veggies.add("Carrot");
		veggies.add("Brinjal");
		veggies.add("DrumSticks");
		veggies.add("Banana");
		veggies.add("Orange");

		List<String> vegSubList = veggies.subList(2, 5);

		System.out.println(vegSubList);
	}
}
