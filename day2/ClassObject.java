package com.Day2;

//class and object 
class Employee {

	// variable declaration
	int eid;
	String ename;
	float esalary;

	// Constructor
	Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	// method
	void display() {
		System.out.println("Employee id : " + eid);
		System.out.println("Employee name : " + ename);
		System.out.println("Employee salary : " + esalary);
		System.out.println("------------------");
	 
	}
}

//main class
public class ClassObject {

	public static void main(String[] args) {

		Employee hema = new Employee(101, "hema", 50000);
		hema.display();

		Employee joe = new Employee(102, "joe", 60000);
		joe.display();

	}

}
