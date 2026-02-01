package com.casestudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class StudentRecodFileIO {
	public static void main(String[] args) {
		System.out.println("main method started");

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\students.txt");

		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Student Id : 101, Name : Ramesh");
			bw.newLine();
			bw.write("Student Id : 102, Name : Raju");
			bw.newLine();
			bw.write("Student Id : 103, Name : Siva");

			bw.close();
			fw.close();

			System.out.println("Students Data written successfully");
		} catch (Exception e) {
			System.err.println("Error While writing file : " + e.getMessage());
		}

		System.out.println("-------------------------------");
		try {
			FileReader fr = new FileReader(f);

			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("Error While reading file !!" + e.getMessage());
		}
		System.out.println("-------------------------------");
	}
}
