package com.java8Features;

//@FunctionalInterface
interface Interf44 {
	void play();

	void show();
}

public class FIWithAnonymosInnerClass {
	public static void main(String[] args) {

		Interf44 i1 = new Interf44() {

			@Override
			public void play() {
				System.out.println("Play Cricket !!");
			}

			@Override
			public void show() {
				System.out.println("SHow methid called !!");
			}
		};

		i1.play();
		i1.show();

	}
}
