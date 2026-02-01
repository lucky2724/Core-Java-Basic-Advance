package com.advancedConcepts;

import java.util.Stack;

public class CollectionsDemo15 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Stack<String> s = new Stack<>();

		s.push("J2SE");
		s.push("J2EE");
		s.push("FRAMEWORKS");
		s.push("DAO");
		s.push("SPRING");
		s.push("SPRING BOOT");
		s.push("MICRO SERVICES");

		System.out.println(s.search("SPRING")); // 1-based index

		System.out.println(s.pop()); // removes last element and returns th elemement
		System.out.println(s.peek());

		System.out.println(s.isEmpty());
		System.out.println(s.empty());

		System.out.println(s);

	}
}
