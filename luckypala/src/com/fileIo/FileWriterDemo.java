package com.fileIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\srikanth.txt");

		FileWriter fw = new FileWriter(f,true);

		fw.write('A');
		fw.write('\n');
		fw.write('B');
		fw.write('\n');
		fw.write('C');
		fw.write('\n');
		fw.write('D');
		fw.write('\n');
		fw.write("Hello Guyzzzz");
		fw.write('\n');
		fw.write("Welcome to Java J2SE");
		fw.flush();

		fw.close();
	}
}
