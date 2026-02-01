package com.advancedConcepts;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileIoDemo06 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started");

		PrintWriter pw = new PrintWriter("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky123.txt");

		pw.println("J2E");
		pw.write("HELLO ");
		pw.println("Frame Works");
		pw.println("Spring");
		pw.println("SPring boot");

		pw.flush();

		pw.close();

		System.out.println("main method ended");

	}
}
