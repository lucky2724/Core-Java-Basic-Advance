package com.fileIo;

import java.io.File;
import java.io.IOException;

public class CreateTxtFileAndSomeMethods {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky.txt3");

		boolean isCreated = f.createNewFile();

		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		System.out.println("**************");
		System.out.println(f.isDirectory());
		System.out.println(f.isHidden());
		System.out.println(f.isFile());
		System.out.println("**************");

		if (isCreated) {
			System.out.println("File has been Created Successfullyy !!");
		} else {
			System.out.println("Something Went Wrong or with this file name already exists !!");
		}

		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());

		if (!f.exists()) {
			// create a file
		} else {
			System.out.println("file this name with already exists !!");
		}
		boolean isDeleted = f.delete();

		if (isDeleted) {
			System.out.println("File can Successfully Deleted");
		} else {
			System.out.println("Can not Delete this File file can't Exists");
		}

		File f1 = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala");

		System.out.println(f1.getFreeSpace() / 1000000000 + " GB");
		System.out.println(f1.getTotalSpace() / 1000000000 + " GB");
		System.out.println(f1.getUsableSpace() / 1000000000 + " GB");

		System.out.println("main method ended");

	}
}
