package com.oopsPractice;

//DOP
//POJO
//MODL

public class Student {
	private int sid;
	private String sname;
	private int sage;

	//setter
	public void setDetails(int sid, String sname, int sage) {
		this.sid = sid;
		this.sname = sname;
		if (sage > 18) {
			this.sage = sage;
		}
	}

	//getter
	public void getDetails() {
		
		System.out.println("Student id : " + sid);
		System.out.println("Student name : " + sname);
		System.out.println("Student age : " + sage);
	}

}
