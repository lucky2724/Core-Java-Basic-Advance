package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<String> staff = new ArrayList<>();

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

		boys.clear();

		System.out.println("======= Students =========");
		System.out.println(students);
		System.out.println(boys);
		students.add("Srikanth");

		System.out.println("------------------------");
		System.out.println(students.contains("Lucky"));
		System.out.println(students.contains("srikant"));

		System.out.println(students.containsAll(boys));

		System.out.println(students.containsAll(staff));// true
		staff.add("Lucky");
		staff.add("Srikanth");
		System.out.println(students.containsAll(staff));// true
	}
}
