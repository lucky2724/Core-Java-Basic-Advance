package com.practVcube;

public class Ed02 {
	static void level2() throws Exception {
		throw new Exception("From level 2");
	}

	static void level1() {
		try {
			level2();
		} catch (Exception e) {
			System.out.println("Handled in level1");
		} finally {
			System.out.println("level1 finally");
		}
	}

	public static void main(String[] args) {
		level1();
	}
}
