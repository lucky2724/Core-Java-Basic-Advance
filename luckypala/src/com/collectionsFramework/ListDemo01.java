package com.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> al = new ArrayList<>();
		al.add(1, 10);// IndexOutOfBoundsException
		al.add(6);
		al.add(4);
		al.add(2);
		al.add(1, 5);
		al.add(2, 7);

		System.out.println(al);
	}
}
