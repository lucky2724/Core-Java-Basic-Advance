package com.advancedConcepts;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo01 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method started");
		// ClassNotFoundException
		// Class.forName("");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky.txt");

		@SuppressWarnings("resource")
		FileReader fr = new FileReader(f);
		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			Thread.sleep(200);
			i = fr.read();
		}

	}
}
