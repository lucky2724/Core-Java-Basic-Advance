package com.fileIo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		FileWriter fw = new FileWriter("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\srikanth2.txt");

		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Good day!!!");
		bw.newLine();
		bw.write("Take Care");
		bw.newLine();
		bw.write("Hello");
		bw.write(65);

		bw.flush();

		bw.close();
		fw.close();

		System.out.println("main method ended");
	}
}
