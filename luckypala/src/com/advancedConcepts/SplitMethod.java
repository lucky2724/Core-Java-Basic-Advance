package com.advancedConcepts;

public class SplitMethod {
	public static void main(String[] args) {

		String s = "Java is Simple by Luckyy";
		String[] str = s.split(" ", 3);

		for (String name : str) {
			System.out.println(name);
		}
	}
}
