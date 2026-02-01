package com.tasksExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -941665721454552301L;

	String username = "LuckyPala";
	transient String password = "Lucky@12345";
	long cardNo = 123456789;
	int cvv = 667788;
}

public class SerilalizationTask {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started");

		Card c = new Card();

		// Serialization
		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\gani.ser");

		FileOutputStream fos = new FileOutputStream(f);

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(c);

		// DeSerialzation
		FileInputStream fis = new FileInputStream("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\gani.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Card c1 = (Card) ois.readObject();

		System.out.println("username : " + c1.username);
		System.out.println("password : " + c1.password);
		System.out.println("card num : " + c1.cardNo);
		System.out.println("CVV      : " + c1.cvv);

		ois.close();
		oos.close();
	}
}
