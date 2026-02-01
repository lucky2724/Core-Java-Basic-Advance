package com.advancedConcepts;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionsDemo13 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Vector<Integer> v = new Vector<>();

		v.add(28);
		v.addElement(20);
		v.addElement(5);
		v.addElement(1);
		v.addElement(10);
		v.addElement(60);

		Collections.sort(v);

		Enumeration<Integer> en = v.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		System.out.println("------------------");

		System.out.println(v);
	}
}
