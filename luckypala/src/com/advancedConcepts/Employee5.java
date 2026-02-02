package com.advancedConcepts;

public class Employee5 implements Comparable<Employee5> {
	private int eid;
	private String ename;
	private double esal;
	private int age;
	private long phone;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", age=" + age + ", phone=" + phone
				+ "]";
	}

	public Employee5(int eid, String ename, double esal, int age, long phone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.age = age;
		this.phone = phone;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

//	@Override
//	public int compareTo(Employee5 o) {
//		return this.getEname().compareTo(o.getEname());
//	}

	@Override
	public int compareTo(Employee5 o) {
		if (this.getAge() < o.getAge()) {
			return -1;
		} else if (this.getAge() > o.getAge()) {
			return 1;
		} else {
			return 0;
		}
	}
}
