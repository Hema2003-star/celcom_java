package com.day3;

class Employee {
	private int Eid;
	private String Ename;
	private double Esalary;

	// constructor
	public Employee(int eid, String ename, double esalary) {
		super();
		Eid = eid;
		Ename = ename;
		Esalary = esalary;
	}

	// Getter and Setter Method
	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public double getEsalary() {
		return Esalary;
	}

	public void setEsalary(double esalary) {
		Esalary = esalary;
	}

}

public class BeanEmployee {

	public static void main(String args[]) {

		Employee e = new Employee(101, " hema ", 50000);

		System.out.println(e.getEname());

		e.setEname("joe");

		System.out.println(e.getEname());

	}

}
