package com.fileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		// File f = new
		// File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\srikanth3.txt");

		FileReader fr = new FileReader("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\srikanth3.txt"); //also use file f

		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		br.close();
		fr.close();
	}
}
