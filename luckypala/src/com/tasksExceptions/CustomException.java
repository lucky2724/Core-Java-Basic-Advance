package com.tasksExceptions;

@SuppressWarnings("serial")
class ChittiException extends Exception {
	ChittiException(String s) {
		super(s);
	}
}

public class CustomException {
	public static void main(String[] args) throws ChittiException {
		System.out.println("main method started");

		int age = 20;

		if (age < 25) {
			throw new ChittiException("Chitti Exception throw chesaaa !!");
		} else {
			System.out.println("Bye Prendssss !!!");
		}
	}
}
