package com.collectionsFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectordemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Vector<Integer> v = new Vector<>();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.removeElement(40);

		System.out.println(v);

		// Modern
		Iterator<Integer> itr = v.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");

		// Legacy
		Enumeration<Integer> en = v.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
