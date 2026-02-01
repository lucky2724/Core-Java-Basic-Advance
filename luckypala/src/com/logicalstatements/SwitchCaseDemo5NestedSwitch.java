package com.logicalstatements;

import java.util.Scanner;

public class SwitchCaseDemo5NestedSwitch {
	public static void main(String[] args) {
		System.out.println("main method started...");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter categary veg/fruits: ");
		String ctg = sc.next();

		switch (ctg) {
		case "veg" -> {
			System.out.println("Enter a vegetable Name");
			String veg = sc.next();
			switch (veg) {
			case "tmt" -> {
				System.out.println("Tomato ");
				System.out.println("1 kg-90/-");
			}
			case "ptt" -> {
				System.out.println("potato");
				System.out.println("1 kg=83/-");
			}
			case "bnd" -> {
				System.out.println("Bendakaay");
				System.out.println("1 kg=65/-");
			}
			default -> System.out.println("Item is Not Available !!");
			}
		}
		case "fruits" -> {
			System.out.println("Enter a Fruite Name");
			String fruit = sc.next();

			switch (fruit) {
			case "orng" -> {
				System.out.println("Orange");
				System.out.println("1 piece-=65/-");
			}
			case "mng" -> {
				System.out.println("Mango");
				System.out.println("1 piece-=95/-");
			}
			case "bnn" -> {
				System.out.println("Banana");
				System.out.println("1 piece-=5/-");
			}
			case "app" -> {
				System.out.println("Apple");
				System.out.println("1 piece-=75/-");
			}
			default -> System.out.println("Item is Not Available !!");
			}
		}
		default -> System.out.println("Category Unknown !!");
		}

		sc.close();
	}
}
