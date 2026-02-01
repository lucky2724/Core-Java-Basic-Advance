package com.advancedConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileIoDemo02 {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		@SuppressWarnings("resource")
		FileWriter fw = new FileWriter("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\surya2.txt");

		fw.write(65);
		fw.write(85);
		fw.write(75);
		fw.write('\n');
		fw.write(88);
		fw.write('\n');
		fw.write(90);
		fw.write('\n');

		fw.write(" Hello Guyzzz !! How Are you Guys!!!");

		fw.write('\n');

		fw.write("Jai Baabuu !!!");
		fw.write('\n');
		fw.write("Arjun Reddyy 9905");
		fw.write('\n');
		fw.write("65");

		fw.flush();
		System.out.println("main method ended");
	}
}
