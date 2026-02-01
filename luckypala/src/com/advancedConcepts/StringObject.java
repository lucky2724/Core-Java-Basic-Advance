package com.advancedConcepts;

public class StringObject {
	public static void main(String[] args) {
		System.out.println("main method started");

//		String s = "Vcube"; // Internally it will created one object at SCP
//		String s1 = new String("Vcube"); // 2 object creates in 1 is from HEAP and 1 is SCP
//
//		String s2 = new String("Kphb");
//		String s3 = new String("Kphb");

		String s4 = "Venkat";
		System.out.println(s4);
		s4 = "Lucky Pala";
		System.out.println(s4);
		String s5 = "Venkat";

		String s6 = new String("Venkat");

		System.out.println(s4 == s5);// true
		System.out.println(s4 == s6);// false

		System.out.println("*************");
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s6));

		String str = "Rishab";
		str.concat(" Panth");
		System.out.println(str);

		System.out.println(str.concat(" Sharma"));

	}
}
