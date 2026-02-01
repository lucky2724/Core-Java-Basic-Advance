package com.advancedConcepts;

public class StringBufferDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		StringBuffer sb6 = new StringBuffer("Java");
		System.out.println(sb6.reverse());

		StringBuffer sb5 = new StringBuffer();
		sb5.ensureCapacity(35);
		System.out.println(sb5.capacity());

		String s1 = new String("Sachin");
		String s2 = new String("tendulkar");

		s1.concat(s2);

		System.out.println(s1); // sachin #thats why Strings are immutable

		StringBuffer sb3 = new StringBuffer("Srikanth");
		sb3.append("srikanthjava");
		sb3.append("srikanthjava1");
		sb3.append("srikanthjava1srikanthjava1");
		sb3.append("srikanthjava1srikanthjava1wwwwwwwwwwwwwwwj");

		System.out.println("sb3 length  : " + sb3.length());
		System.out.println("sb3 capacity :" + sb3.capacity());

		StringBuffer sb1 = new StringBuffer("Rishab");
		StringBuffer sb2 = new StringBuffer(" Panth");

		sb1.append(sb2);

		System.out.println(sb1);// Rishab #stringBuffer was mutable

		StringBuffer sb4 = new StringBuffer("Srikanth");
		sb4.delete(3, 6);
		sb4.deleteCharAt(3);
		System.out.println(sb4);
	}
}
