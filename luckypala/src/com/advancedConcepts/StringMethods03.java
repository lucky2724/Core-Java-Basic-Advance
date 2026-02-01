package com.advancedConcepts;

public class StringMethods03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "       Java is Simple By Lucky but Lucky is aaaaaa  ";

		System.out.println("given String   : " + s);

		s = s.replace('a', 'A');
		s = s.replace("Lucky", "Srikanth");

		s = s.trim();

		System.out.println("Updated String : " + s);
	}
}
