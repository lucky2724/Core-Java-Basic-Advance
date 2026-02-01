package com.practVcube;


interface A1 {
	void show();
}

interface A2 {
	void show();
}

class Co implements A1, A2 {

	@Override
	public void show() {
		System.out.println("HELLOOOO");
	}
	
	public static void main(String[] args) {
		Co c=new Co();
		
		c.show();
	}

}
