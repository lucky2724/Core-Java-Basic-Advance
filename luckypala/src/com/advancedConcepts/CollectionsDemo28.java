package com.advancedConcepts;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsDemo28 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Queue<Integer> q = new LinkedList<>();

		q.add(10);
		q.add(5);
		q.add(6);
		q.add(2);
		q.add(3);
		q.add(4);

		q.remove();

		System.out.println(q.element());

		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);
		q.poll();
		System.out.println(q.peek());

		System.out.println(q);
	}
}
