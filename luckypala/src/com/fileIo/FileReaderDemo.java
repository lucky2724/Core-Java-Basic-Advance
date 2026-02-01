package com.fileIo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\srikanth3.txt");

		try (FileReader fr = new FileReader(f)) {

			int i = fr.read();

			while (i != -1) {
				System.out.print((char) i);
				Thread.sleep(100);
				i = fr.read();
			}
		}

		System.out.println("main method ended");
	}
}
