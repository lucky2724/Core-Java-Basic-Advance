package com.fileIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("main method  started");

		FileInputStream fis = new FileInputStream("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\siri.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Student1 st = (Student1) ois.readObject();

		System.out.println("-----------------------");
		System.out.println("Student id   : " + st.sid);
		System.out.println("Student Name : " + st.name);
		System.out.println("Password     :" + st.password);
		System.out.println("-----------------------");

		ois.close();
		fis.close();
	}
}
