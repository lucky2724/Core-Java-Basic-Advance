package com.strings;

public class StringBuffer03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		StringBuffer sb1 = new StringBuffer("Srikanth");
		sb1.delete(0, 4);
		sb1.deleteCharAt(2);

		System.out.println(sb1);

		StringBuffer sb2 = new StringBuffer();
		sb2.ensureCapacity(17);
		System.out.println(sb2.capacity());// 34

		StringBuffer sb3 = new StringBuffer("JavaProgramming");
		sb3.reverse();
		System.out.println(sb3);

	}
}
