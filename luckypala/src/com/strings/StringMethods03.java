package com.strings;

public class StringMethods03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		// Concat
		String str1 = "Java";
		String str2 = " Lucky";

		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);
		System.out.println(str1 + 123);

		System.out.println("-----------------------");

		// contains
		String[] names = { "Abhishek", "Sky", "Tilak", "Sanju", "Ishan", "Hardhik" };

		for (String name : names) {
			if (name.contains("sh")) {
				System.out.println(name);
			}
		}

		System.out.println("-----------------------");

		// contentEquals()
		CharSequence cs = "Java";
		System.out.println(str1.contentEquals("Java"));// true
		System.out.println(str1.contentEquals(cs));

		System.out.println("-----------------------");

		// copyValueOf()
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(nums); // Address

		char[] ch = { 'A', 'P', 'P', 'L', 'E' };
		System.out.println(ch); // APPLE
		
		System.out.println(String.copyValueOf(ch));

	}
}
