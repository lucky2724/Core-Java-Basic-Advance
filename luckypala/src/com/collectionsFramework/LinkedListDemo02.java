package com.collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		LinkedList<Integer> l = new LinkedList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);

		l.offer(10);
		l.offerFirst(100);
		l.offerLast(300);

		System.out.println(l);

		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l.poll());

		System.out.println("-----------------");

		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println("-----------------");
		System.out.println(l);

	}
}
