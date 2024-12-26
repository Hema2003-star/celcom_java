package com.sms.view;

import java.util.Scanner;

import com.sms.model.Department;

/**
 * 
 * @version 1.0 It is performing Validation Service
 */
public class DepartmentView {

	static Scanner sc = new Scanner(System.in);
	static int dno;
	static String dname;

	/**
	 * 
	 * @return Static It is performing insert view operation.
	 */

	public static Department insertDepartmentView() {
		System.out.println("Enter Department dno and dname");
		dno = sc.nextInt();
		dname = sc.next();

		return new Department(dno, dname);
	}

	/**
	 * 
	 * @return Static It is performing delete view operation.
	 */
	public static int deleteDepartmentView() {
		System.out.println("Enter Department id");
		return sc.nextInt();
	}

	
			/**
			 * 
			 * @return Static 
			 * It is performing update view operation.
			 */
	public static Department updateDepartmentView() {
		System.out.println("Enter Department dno and dname");

		dno = sc.nextInt();
		dname = sc.next();

		return new Department(dno, dname);
	}

	
	/**
	 * 
	 * @return Static It is performing find view operation.
	 */
	public static int findDepartmentView() {
		System.out.println("Enter Department id");
		return sc.nextInt();
	}

}
