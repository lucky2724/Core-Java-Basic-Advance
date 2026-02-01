package com.oopsPractice;

public class ObjectClassMethod {
	// private int a = 10;

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectClassMethod t1 = new ObjectClassMethod();

		ObjectClassMethod t2 = new ObjectClassMethod();

		// ObjectClassMethod t2 = (ObjectClassMethod) t1.clone();

		System.out.println(t1.toString());

		System.out.println(t1.equals(t2));

		System.out.println(t1.getClass());// returns fully qualiified name

		// System.out.println(t2);
		System.out.println(t1); // @2b2fa4f7
		System.out.println(t1.hashCode());
		System.out.println(0x2b2fa4f7);
	}
}
