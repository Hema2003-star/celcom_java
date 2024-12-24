package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class EmployeeView {

	static Scanner sc = new Scanner(System.in);
	static int eid, esalary, dno;
	static String ename, dname;

	/**
	 * 
	 * @return Static It is performing insert view operation.
	 */

	public static Employee insertEmployeeView() {
		System.out.println("Enter Employee id, name, salary and dno");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Employee(eid, ename, esalary, department); // passing all data in one employee object
	}

	/**
	 * 
	 * @return Static It is performing delete view operation.
	 */
	public static int deleteEmployeeView() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
	}

	/**
	 * 
	 * @return Static It is performing update view operation.
	 */
	public static Employee updateEmployeeView() {
		System.out.println("Enter Employee id, name, salary and dno to update employee");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Employee(eid, ename, esalary, department); // passing all data in one employee object
	}

	/**
	 * 
	 * @return Static It is performing find view operation.
	 */
	public static int findEmployeeView() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
	}

	/**
	 * 
	 * @param args It is the main method
	 */

}
