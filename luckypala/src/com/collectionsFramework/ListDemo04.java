package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo04 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.set(4, 50);
		list.set(2, 367);
		
		System.out.println(list.get(4));
		System.out.println(list);

		System.out.println("----for-------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("----for each-------");

		for (int a : list) {
			System.out.println(a);
		}

		System.out.println("----Iterator-------");
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
