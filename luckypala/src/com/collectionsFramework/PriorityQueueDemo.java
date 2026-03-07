package com.collectionsFramework;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Queue<Integer> q = new PriorityQueue<>();

		q.offer(10);
		q.offer(3);
		q.offer(5);
		q.offer(8);
		q.offer(15);

		System.out.println(q.poll());
		System.out.println(q.peek());

		System.out.println(q);
		
		System.out.println("-----------------------");

		Queue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());

		q1.offer(10);
		q1.offer(3);
		q1.offer(5);
		q1.offer(8);
		q1.offer(15);

		System.out.println(q1.poll());
		System.out.println(q1.peek());

		System.out.println(q1);
	}
}
