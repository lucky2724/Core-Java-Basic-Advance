package com.collectionsFramework;

import java.util.Map;
import java.util.WeakHashMap;

class Temp {
	@Override
	public String toString() {
		return "Srikanth";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called..!!");
	}
}

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");

		Map<Object, String> map = new WeakHashMap<>();

		Temp t = new Temp();
		System.out.println(t);

		map.put(t, "Java");

		System.out.println(map);

		t = null;
		System.gc();

		Thread.sleep(3000);
		System.out.println(map);

	}
}
