package com.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> l = new ArrayList<>();
		// l.add(1, 10); java.lang.IndexOutOfBoundsException

		l.add(10);
		l.add(18);
		l.add(0, 4);
		l.add(1);
		l.add(33);
		l.add(2, 9);
		l.add(3, 44);
		l.add(1, 77);

//		l.remove(18);//Index 18 out of bounds for length 8
		l.remove(1);// takes index 1 val 18 remove
		l.remove(l.indexOf(18));

		System.out.println("l : " + l);

		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);

		System.out.println("l1 : " + l1);

		List<Integer> l2 = new ArrayList<>();
		l2.addAll(0, l);
		l2.addAll(1, l1);
		l2.removeAll(l1);

		System.out.println("l2 : " + l2);

	}
}
