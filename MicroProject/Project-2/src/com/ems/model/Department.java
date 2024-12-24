package com.ems.model;

/**
 * @author Hemalatha B
 * @version 1.1 
 * It is a bean class for department
 */
public class Department {
	private int dno;
	private String dname;

	public Department() { // constructor

	}

	public Department(int dno, String dname) { // parameterized constructor
		super();
		this.dno = dno;
		this.dname = dname;
	}

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

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}

}
