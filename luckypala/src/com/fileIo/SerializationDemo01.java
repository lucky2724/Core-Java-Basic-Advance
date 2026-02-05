package com.fileIo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6799517697687101860L;
	int sid = 123;
	String name = "Luckyy";
	transient String password = "Java@123";

}

public class SerializationDemo01 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started");

		Student1 s = new Student1();

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\siri.ser");

		FileOutputStream fos = new FileOutputStream(f);// expected file or STring

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(s);

		oos.close();
		fos.close();

//		FileInputStream fis = new FileInputStream("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\siri.ser");
//
//		ObjectInputStream ois = new ObjectInputStream(fis);
//
//		Student1 st = (Student1) ois.readObject();
//
//		System.out.println(st.sid);
//		System.out.println(st.name);
//		System.out.println(st.password);
//
//		ois.close();
//		fis.close();
	}
}
