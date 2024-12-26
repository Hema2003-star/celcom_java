package com.sms.model;

/**
 * @author Hemalatha B
 * @version 1.1 It is a bean class for department
 */

public class Department {
	private int dno;
	private String dname;

	public Department() { // Constructor
		super();
	}

	public Department(int dno, String dname) { // parmeterized constructor
		super();
		this.dno = dno;
		this.dname = dname;
	}

	// getter and setter method
	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// toString
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}

}
