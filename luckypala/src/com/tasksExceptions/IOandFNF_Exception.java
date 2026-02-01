package com.tasksExceptions;

import java.io.FileReader;

public class IOandFNF_Exception {
	public static void main(String[] args) {
		System.out.println("main method started");

		FileReader fr = null;

		try {
			fr = new FileReader("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky.txt2");

			int i = fr.read();

			while (i != -1) {
				System.out.print((char) i);
				Thread.sleep(200);
				i = fr.read();
			}

			fr.close();
		} catch (Exception e) {
			System.err.println("in Cath");
			e.printStackTrace();
		}

		System.out.println("main method ended");

	}
}
