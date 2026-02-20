package com.collectionsFramework;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		// LIFO
		Stack<String> s = new Stack<>();

		s.push("J2SE");
		s.push("J2EE");
		s.push("J2ME");
		s.push("FRAMEWORKS");
		s.push("SPRING");
		s.push("SPRING BOOT");
		s.push("MICRO SERVICES");
		s.push("JDBE");
		s.push("SERVLETS");
		s.push("JSP");

		System.out.println(s.pop());
		System.out.println(s.peek());

		System.out.println(s.search("JDBC"));

		System.out.println(s.isEmpty());
		System.out.println(s.empty());

		System.out.println(s);

	}
}

//If stack is empty you can try to  perform pop() and peek() methods you will gwt a java.util.EmptyStackException
