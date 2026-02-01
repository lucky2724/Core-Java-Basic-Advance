package com.fileIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\srikanth3.txt");

		PrintWriter pw = new PrintWriter(f);

		pw.println("Hello Java");
		pw.println("Hello SQL");
		pw.println("Hello HTML");
		pw.println("Hello CSS JAVA");
		pw.println(200);
		pw.println(true);
		pw.println('A');
		pw.println(19.44);
		pw.println(pw);

		pw.flush();

	}
}
