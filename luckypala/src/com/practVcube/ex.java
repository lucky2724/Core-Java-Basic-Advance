package com.practVcube;

public class ex {
	int a = 10;
	
	  int display() {
			int a = 20;
			return a;
		}

	public void main(String[] args) {
		int a=30;
		System.out.println(a);
		System.out.println(new ex().display());
		System.out.println(ex.this.a);
	}
}
