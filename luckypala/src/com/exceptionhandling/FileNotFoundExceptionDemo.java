package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionDemo {
	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
		System.out.println("main method started");

		FileReader fr = null;

		// FileNotFoundException
		fr = new FileReader("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\surya.txt");

		int i = fr.read();

		System.out.println(i); // 100

		while (i != -1) {
			System.out.print((char) i);
			// InterruptedException
			Thread.sleep(100);
			i = fr.read();
		}

		fr.close();

		System.out.println("main method ended");

	}
}
