package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<String> boys = new ArrayList<>();

		boys.add("Lucky");
		boys.add("Koteshwar");
		boys.add("Praveen Bhaii");
		boys.add("Chenna keshava");
		boys.add("siva Reddy");
		boys.add("David Bhaii");

		System.out.println("======= Boys =========");
		System.out.println(boys);

		Collection<String> girls = new ArrayList<>();

		girls.add("Katchu");
		girls.add("Bhavani");
		girls.add("Deepthi");
		girls.add("Sneha");
		girls.add("Sushu");
		girls.add("Dhanasri");

		System.out.println("======= Girls =========");
		System.out.println(girls);

		Collection<String> students = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);

		System.out.println("======= Students =========");
		System.out.println(students);
	}
}
