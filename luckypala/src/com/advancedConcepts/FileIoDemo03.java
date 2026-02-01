package com.advancedConcepts;

import java.io.FileReader;
import java.io.IOException;

public class FileIoDemo03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method started");

		@SuppressWarnings("resource")
		FileReader fr = new FileReader("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\surya.txt");

		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			Thread.sleep(200);
			i = fr.read();
		}

		System.out.println("main method ended..");
	}
}
