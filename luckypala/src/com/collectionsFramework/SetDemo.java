package com.collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Set<Integer> ss = new HashSet<>();
		ss.add(18);// 2
		ss.add(45);// 13
		ss.add(1);// 1
		ss.add(33);// 1
		ss.add(7);// 7
		ss.add(4);// 4
		ss.add(10);// 10
		ss.add(9);// 9
		ss.add(8);// 8
		ss.add(8);// false
		ss.add(8);// false

		System.out.println(ss);// 1 33 18 4 7 8 9 10 45

	}
}
