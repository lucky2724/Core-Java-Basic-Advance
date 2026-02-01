package com.fileIo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskIO {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\A.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("Hello Java");
		fw.write('\n');
		fw.write("Bye Java");
		fw.flush();

		File f2 = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\B.txt");
		FileWriter fw2 = new FileWriter(f2);
		fw2.write("Hello SQL");
		fw2.write('\n');
		fw2.write("Bye SQL");
		fw2.flush();

		File f3 = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\C.txt");
		f3.createNewFile();
		FileWriter fw3 = new FileWriter(f3);

		FileReader fr = new FileReader(f);
		FileReader fr2 = new FileReader(f2);

		int i = fr.read();
		while (i != -1) {
			fw3.write((char) i);
			i = fr.read();
		}

		fw3.write('\n');
		fw3.write('\n');

		int i1 = fr2.read();
		while (i1 != -1) {
			fw3.write((char) i1);
			i1 = fr2.read();
		}
		fw3.flush();

		FileReader fr3 = new FileReader(f3);

		int i2 = fr3.read();
		while (i2 != -1) {
			System.out.print((char) i2);
			i2 = fr3.read();
		}

		fr3.close();
		fr2.close();
		fr.close();
		fw3.close();
		fw2.close();
		fw.close();

		System.out.println();
		System.out.println("main method emded");

	}
}
