package com.advancedConcepts;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo03 {
	static void getInfo() throws IOException {
		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky123.txt");
		f.createNewFile();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		getInfo();
	}
}
