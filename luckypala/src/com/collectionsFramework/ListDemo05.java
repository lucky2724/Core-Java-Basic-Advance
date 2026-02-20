package com.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo05 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		// System.out.println(list.subList(0, 5));

		List<Integer> subList = list.subList(1, 5);

		System.out.println("LIST : " + list);
		System.out.println("SUB-LIST : " + subList);

		System.out.println("-----------------------");

		subList.set(3, 555);
		list.set(3, 444);

		System.out.println("LIST : " + list);
		System.out.println("SUB-LIST : " + subList);

	}
}
