package com.oops;

 public class Override02 extends Override01  {
	@Override
	void hello() throws InterruptedException{
		System.out.println("Helloo Child Class...");
	}

	@Override
	Number num() {
		return 5;
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started..");

		Override02 ov = new Override02();
		ov.hello();
		System.out.println(ov.num());

	}
}
