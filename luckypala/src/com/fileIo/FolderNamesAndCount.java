package com.fileIo;

import java.io.File;

public class FolderNamesAndCount {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\palal\\OneDrive\\Documents");

		String[] names = f.list();

		int count = 1;

		for (String name : names) {
			System.out.println(count++ + " -> " + name);
		}

		System.out.println(count - 1 + " files are Here !!");
	}
}
