package com.strings;

public class StringMethods04 {
	public static void main(String[] args) {
		System.out.println("main method started");

		//startsWith() and endsWith()
		String[] heros = { "Ramcharan", "jr NTR", "power star", "Prabash", "Mahesh", "Bhaii", "Sampurnesh", "Ram p" };

		for (String hero : heros) {
			if ((hero.endsWith("h") && hero.contains("p")) || hero.startsWith("R")) {
				System.out.println(hero);
			}
		}
	}
}
