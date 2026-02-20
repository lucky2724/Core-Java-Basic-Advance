package com.collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		LinkedList<Integer> l = new LinkedList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(25);
		l.addFirst(456);
		l.addLast(234);
		l.addFirst(4526);
		l.addLast(1234);

		System.out.println(l.peek());
		System.out.println(l.poll());

		System.out.println(l);

		l.removeFirst();
		l.removeLast();

		System.out.println(l.getFirst());
		System.out.println(l.getLast());

		System.out.println(l);
	}
}
