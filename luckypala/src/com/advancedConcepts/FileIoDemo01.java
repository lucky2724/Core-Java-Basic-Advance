package com.advancedConcepts;

import java.io.File;
import java.io.IOException;

public class FileIoDemo01 {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\Test");

		boolean status = f.createNewFile();

		if (status) {
			System.out.println("File Successfully Created ");
		} else {
			System.out.println("SOmething Went wrong !!");
		}

		File f1 = new File(f, "ram.pdf");
		f1.createNewFile();

		System.out.println("main method ended");

	}
}
