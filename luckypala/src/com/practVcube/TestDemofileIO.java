package com.practVcube;

import java.io.File;
import java.io.IOException;

public class TestDemofileIO {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started..");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\lucky3.txt");

		boolean isCreated = f.createNewFile();

		if (isCreated) {
			System.out.println("File Successfully Created..!!!!");
		} else {
			System.out.println("Something Went wrong or File alraedy exists..!!");
		}
		
		System.out.println(f.getFreeSpace()/1000000000 +" GB");
		System.out.println(f.getTotalSpace()/1000000000+" GB");
		System.out.println(f.getUsableSpace()/1000000000+" GB");

		System.out.println(f.exists());
		
		f.delete();

		System.out.println(f.exists());
		System.out.println("***********************");
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		System.out.println("****************************");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getCanonicalFile());
		System.out.println(f.getClass());
		
		System.out.println("****************************");
		System.out.println(f.isHidden());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println("main method ended..");

	}
}
