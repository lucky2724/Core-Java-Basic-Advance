package com.advancedConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Employee implements Serializable {

	String username = "admin";
	transient String password = "admin@123";
}

public class FileIoDemo07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started");

		Employee e = new Employee();

		// Serialization
		FileOutputStream fos = new FileOutputStream("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\abc.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(e);
		oos.close();

		// DeSerialization
		FileInputStream fis = new FileInputStream("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\abc.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e1 = (Employee) ois.readObject();

		System.out.println("Username : " + e1.username);
		System.out.println("pasword : " + e1.password);
		ois.close();
	}
}
