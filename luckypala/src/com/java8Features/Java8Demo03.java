package com.java8Features;

interface Interf33 {
	public abstract int sqrt(int a);
}

public class Java8Demo03 {
	public static void main(String[] args) {

		Interf33 i1 = a -> a * a;

		System.out.println(i1.sqrt(8));
	}
}
