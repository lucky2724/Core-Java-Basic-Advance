package com.collectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Queue<Integer> q = new LinkedList<>();

//		q.add(10);
//		q.add(12);
//		q.add(14);
//		q.add(9);
//		q.add(8);
//		q.add(65);
//		q.add(6);
//		q.add(10);

//		System.out.println(q.remove()); //NoSuchElementExceotion when Queue is Empty
//		System.out.println(q.element());

		System.out.println(q.poll());
		System.out.println(q.peek());

		q.offer(10);
		q.offer(20);
		q.offer(40);
		q.offer(60);
		q.offer(30);
		q.offer(50);
		q.offer(90);

		System.out.println(q.poll());
		System.out.println(q.peek());

		System.out.println(q);

	}
}
