package com.practVcube;

public class Ed01 {
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
			try {
				throw new Exception("Inner Exception");
			} finally {
				System.out.println("Inner finally");
				throw new RuntimeException("finally Exception");

			}
		} catch (Exception e) {
			System.out.println("Caught : " + e.getMessage());
		}
	}
}
