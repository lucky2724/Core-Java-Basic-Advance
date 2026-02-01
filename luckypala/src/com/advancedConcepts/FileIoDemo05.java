package com.advancedConcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIoDemo05 {
	public static void main(String[] args) throws IOException {

		System.out.println("main method started");

		FileWriter fw = new FileWriter("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\surya.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(100);
		bw.write(101);
		bw.write(102);
		bw.write(103);
		bw.write(104);
		bw.write(105);

		bw.newLine();

		bw.write("Have a nice day !!!");
		bw.newLine();
		bw.write("Dont judge a book by its cover");
		bw.newLine();
		bw.append("Hey Its append !!");
		bw.flush();

		bw.close();
		fw.close();

		System.out.println("main method ended");
	}
}
