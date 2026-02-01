package com.practVcube;

import java.io.File;
import java.io.IOException;

public class TestDemofileIO2 {
	public static void main(String[] args) throws IOException
{
		System.out.println("mman method started..");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\Desktop");

		String[] names = f.list();

		int count = 1;

		for (String name : names) {
			System.out.println(count++ + " -> " + name);
		}

		System.out.println("Count : " + (count - 1));
	}
}
