package com.collections;

public class ArraysObject {
	public static void main(String[] args) {
		System.out.println("main method started");

		Object[] arr = { 10, "Luckyy Pala", 'A', 9502876688L, true, 165.65 };

		for (Object obj : arr) {
			System.out.println(obj);
		}
	}
}
