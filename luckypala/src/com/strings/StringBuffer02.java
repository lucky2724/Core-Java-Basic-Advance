package com.strings;

public class StringBuffer02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		StringBuffer sb1 = new StringBuffer();
		// System.out.println(sb1);
		System.out.println(sb1.capacity()); // 16

		System.out.println("---------------------------");
		StringBuffer sb2 = new StringBuffer("Srikanth");
		System.out.println(sb2.capacity());// 24

		System.out.println("---------------------------");
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Srikanth");
		System.out.println(sb3.capacity());// 16

		System.out.println("---------------------------");
		StringBuffer sb4 = new StringBuffer();
		sb4.append("SrikanthSrikanths");
		System.out.println(sb4.capacity());// 16*2+2=>34

		System.out.println("---------------------------");
		StringBuffer sb5 = new StringBuffer();
		sb5.append("SrikanthSrikanthsSrikanthSrikanthssss");
		System.out.println(sb5.capacity());// 16*2+2=>34+1+1+1 = 37

		System.out.println("---------------------------");
		StringBuffer sb6 = new StringBuffer();// 16
		sb6.append("SrikanthSrikanthSrikanthSrikanthsri");// 35
		sb6.append("s");// 35*2+2
		sb6.append("SrikanthSrikanthSrikanthSrikanthSrikan");// 72*2+2=146
		System.out.println(sb6.capacity());

	}
}
