package com.strings;

public class StringsDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		StringsDemo01 sd = new StringsDemo01();
		System.out.println(sd);

		String str1 = "Hello"; // 1 obj in SCP
		String str2 = "Hello"; // 0 obj

		System.out.println(str1 + " " + str2);

		String s1 = new String("Java");// 1 object in Heap Memory + 1 object in SCP --> 2 objects
		System.out.println(s1);

		String s2 = new String("Java");// 1 object Heap Memory -->1 object
		System.out.println(s2);

		// String literal
		String s11 = "Srikanth Java";

		// String with new Object
		String s12 = new String("Vcube SoftWare Solutions");

		// String with re-assignmet
		String s13 = s11;

		// String With concatnaion
		String s14 = "Hello" + "Java";

		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);

		System.out.println("main method ended");

	}
}
