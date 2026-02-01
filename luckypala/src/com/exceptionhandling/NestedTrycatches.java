package com.exceptionhandling;

public class NestedTrycatches {
	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in Outer try ");
			try {
				System.out.println("in try -> Inner try");
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.err.println("in Catch ->  Inner try");
			} finally {
				System.out.println("in finally ->  Inner try");
			}
			System.out.println(10 / 0);
			System.out.println("Hello Guys,I AM BACK !!");
		} catch (Exception e) {
			System.err.println("in Outer catch");
			try {
				System.out.println("in try -> Inner catch");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.err.println("in catch -> Inner Catch");
			} finally {
				System.out.println("in finally -> inner catch");
			}
		} finally {
			System.out.println("in Outer finally");
			try {
				System.out.println("in try -> Inner finally");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.err.println("in catch -> Inner finally");
			} finally {
				System.out.println("in finally -> inner finally");
			}
		}

	}
}
