package com.java8Features;

import java.util.function.Function;

public class FunctionDemo2 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Function<Integer, Integer> f1 = i -> 2 * i;
		Function<Integer, Integer> f2 = i -> i * i * i;

		System.out.println(f1.andThen(f2).apply(2));// first f1 and then f2 ->f2( 2*2)=4 -> 4*4*4=64
		System.out.println(f1.compose(f2).apply(2));// first f2 and then f1 -> f1(2*2*2)=8 -> 2*8=16
	}
}
