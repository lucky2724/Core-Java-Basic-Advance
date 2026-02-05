package com.strings;

public class StringsDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "Kohli"; // SCP -> 1 obj
		String s1 = "Kohli";// SCP -> 0 obj

		String s2 = new String("Rohit");// Heap --> 2 Obj - 1 in SCP 1 in Heap
		String s3 = new String("Rohit");// Heap --> 1obj in Heap 0 obj in scp

		String s4 = "Rohit"; // 0 obj

		String s5 = new String("Kohli");// 1 obj in Heap

		s1 = "virat"; 

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

	}
}
