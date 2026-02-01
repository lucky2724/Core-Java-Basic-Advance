package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class IOExceptionDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\surya.txt");

		// IOException while creating a new file
		f.createNewFile();

		System.out.println("main method ended");
	}
}
