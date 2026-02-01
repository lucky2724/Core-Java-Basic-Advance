package com.oops;

//DTO - Data transfer Onject
//POJO - Plain old obbject data
//MODEL - Data model

public class Student extends Object {
	private int sid;
	private String sname;
	private int sage;

	// to modifieing the data
	public void setSid(int sid) {
		this.sid = sid;
	}

	// getters for access
	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname + " - India";
	}

	public String getSname() {
		return sname;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getSage() {
		return sage;
	}

}
