package com.Day2;

class Employee1 {

	// variable declaration
	int eid;
	String ename;
	float esalary;

	// Constructor
	Employee1(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.display();
	}

	Employee1() {
		this(101, "hema", 20000); // current class constructor calling

	}

	// method
	void display() {
		System.out.println("Employee id : " + eid);
		System.out.println("Employee name : " + ename);
		System.out.println("Employee salary : " + esalary);
		System.out.println("------------------");

	}
}

// main class
public class ThisKeyword {

	public static void main(String[] args) {

		Employee1 hema = new Employee1();

	}

}
