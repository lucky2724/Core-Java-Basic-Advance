package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<String> boys = new ArrayList<>();

		boys.add("Govindh");
		boys.add("Anand");
		boys.add("Lucky");
		boys.add("Ram");
		boys.add("Sai");

		System.out.println(boys);

		Collection<String> girls = new ArrayList<>();
		girls.add("deepthi");
		girls.add("Ammu");
		girls.add("Sneha");
		girls.add("Kachu");
		girls.add("Chitti");

		System.out.println(girls);

		Collection<String> students = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);

		System.out.println(students);

		System.out.println("---------------------");
		System.out.println(boys.contains("raju"));
		System.out.println(boys.contains("Ram"));
		System.out.println("---------------------");

		System.out.println(students.containsAll(boys));

	}
}
