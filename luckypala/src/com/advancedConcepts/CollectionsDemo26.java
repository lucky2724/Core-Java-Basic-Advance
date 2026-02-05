package com.advancedConcepts;

import java.util.Map;
import java.util.WeakHashMap;

class Hello {

	@Override
	public String toString() {
		return "Hello ";
	}

}

public class CollectionsDemo26 {
	@Override
	protected void finalize() {
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main method started");

		Map<Object, String> map = new WeakHashMap<>();

		Hello h = new Hello();

		map.put(h, " Hello Vube");

		System.out.println(map);

		h = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(map);

	}
}
