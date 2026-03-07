package com.collectionsFramework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Deque<Integer> dq = new LinkedList<>();

		dq.offer(10);
		dq.offer(20);
		dq.offer(30);
		dq.offerFirst(300);
		dq.offerFirst(456);
		dq.offerLast(289);
		dq.offerLast(888);

		System.out.println(dq.pollLast());
		System.out.println(dq.peekLast());

		System.out.println(dq.pollFirst());
		System.out.println(dq.peekLast());

		System.out.println(dq);
	}
}
