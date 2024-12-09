//Write a Java program to create a class called "Employee" with a name, job title, 
//and salary attributes, and methods to calculate and update salary.

package com.assignments;

import java.util.Scanner;

class Employee {

	// variables
	private String eName;
	private String eJob;
	private double salary;

	// constructor
	public Employee(String eName, String eJob, double salary) {
		super();
		this.eName = eName;
		this.eJob = eJob;
		this.salary = salary;
	}

	// setter and getter method
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteJob() {
		return eJob;
	}

	public void seteJob(String eJob) {
		this.eJob = eJob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculate() {
		return salary * 12;
	}

	public void display() {
		System.out.println("Employee details ");
		System.out.println("Employee name :" + eName);
		System.out.println("Employee job :" + eJob);
		System.out.println("Employee salary :" + salary);
		System.out.println("");

	}

}

public class Problem6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee name :");
		String eName = sc.nextLine();

		System.out.println("Enter the employee job :");
		String eJob = sc.nextLine();

		System.out.println("Enter the employee salary : ");
		double salary = sc.nextFloat();

		Employee employee = new Employee(eName, eJob, salary);
		employee.display();

		System.out.println("The Annual salary " + employee.calculate());		
		System.out.println("--------------------");
		
		while(true) {
			System.out.println("1.update salary");
			System.out.println("2.Exit");
			
			System.out.println("Enter your choice");		
			int choice = sc.nextInt();
			
			switch(choice) {
				
			case 1 :
				
				System.out.println("enter the updated salary");
				employee.setSalary(sc.nextFloat());
				employee.display();
				System.out.println("");
				System.out.println("The Annual salary " + employee.calculate());
				break;

			case 2 :
				System.out.println("Thank you");
				System.exit(0);
				break;
				
			default :
				System.out.println("Invalid choice , please try again");
			}
		}

	}

}
