package com.advancedConcepts;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Zsong {
	public static void main(String[] args) throws IOException, InterruptedException {

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky.txt2");

		FileReader fr = new FileReader(f);

		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			Thread.sleep(170);
			i = fr.read();
		}

		fr.close();
	}
}
