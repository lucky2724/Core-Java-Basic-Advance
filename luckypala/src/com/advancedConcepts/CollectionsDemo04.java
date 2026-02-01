package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionsDemo04 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Collection<String> boys = new ArrayList<>();

		boys.add("Govindh");
		boys.add("Anand");
		boys.add("Lucky");
		boys.add("Ram");
		boys.add("Sai");

		System.out.println(boys.contains("Ram"));
		System.out.println(boys.contains("Surya"));
		System.out.println("---------------");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a name to you Search : ");
		String name = sc.nextLine();

		if (boys.contains(name)) {
			System.out.println(name + " is Available !!");
		} else {
			System.out.println(name + " is Not Available !!");
		}

		System.out.println(boys);

		sc.close();

	}
}
