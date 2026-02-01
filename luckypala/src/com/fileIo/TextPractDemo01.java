package com.fileIo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextPractDemo01 {
	public static void main(String[] args) {

		//IOException and FileNotFoundException
		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky.txt");

		try (FileReader fr = new FileReader(f)) {
			int i = fr.read();

			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
