package com.advancedConcepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIoDemo04 {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		FileReader fr = new FileReader("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\surya.txt");

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
