package com.advancedConcepts;

public class StringMethods {
	public static void main(String[] args) {

		String s = "Vcube Software Solutions";

		System.out.println(s.charAt(7)); // char
		System.out.println(s.codePointAt(1)); // int
		System.out.println(s.codePointCount(1, 3));

		System.out.println(s.length());

		String s1 = "Java";
		String s2 = "Java Simple";

		System.out.println(s2.compareTo(s1));

		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2);

		System.out.println(s2.contains(s1));

		char ch[] = { 'A', 'P', 'P', 'L', 'E' };
		System.out.println(ch);

		String str11 = String.copyValueOf(ch);
		System.out.println(str11);

		System.out.println("************");

		String[] names = { "Navya", "Deepthi", "kavya", "Sri", "Sowmya" };

		for (String name : names) {
			if (name.endsWith("vya")) {
				System.out.println(name);
			}
		}

		System.out.println("************");
		
		
	}
}
