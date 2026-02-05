package com.fileIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3662472337101080484L;

	String username = "LuckyPala";
	transient String password = "Java@1234";
}

public class SerializationPractice {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method ended");

		Student s = new Student();

		// Serializtaion
		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\java.ser");

		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(s);

		// De-Serializtaion
		FileInputStream fis = new FileInputStream("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\java.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student st = (Student) ois.readObject();

		System.out.println("Name     : " + st.username);
		System.out.println("password :" + st.password);

		ois.close();
		oos.close();

	}
}
