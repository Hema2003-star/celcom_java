package com.sms.main;

import java.util.Scanner;

import com.sms.model.Department;
import com.sms.model.Student;
import com.sms.service.DepartmentService;
import com.sms.service.DepartmentServiceImpl;
import com.sms.service.StudentService;
import com.sms.view.DepartmentView;
import com.sms.view.StudentView;
import com.sms.service.StudentServiceImpl;

/**
 * @version 1.0 It is the main class
 */

public class SMSApp {

	static Scanner sc = new Scanner(System.in);

	

	/**
	 * 
	 * @param args It is the main method
	 */
	public static void main(String[] args) {

		StudentService studentService = new StudentServiceImpl();
		DepartmentService departmentService = new DepartmentServiceImpl();
		String result = "";
		Student student;
		Department department;
		int studentId= 0;

		String msg = "";

		do {
			int choice = StudentView.printMenu();

			switch (choice) {
			case 1:
				student = StudentView.insertStudentView();
				result = studentService.insertStudentValidation(student);
				StudentView.printResult(result);
				break;
			case 2:
				studentId = StudentView.deleteStudentView();
				result = studentService.deleteStudentValidation(studentId);
				StudentView.printResult(result);
				break;
			case 3:
				student = StudentView.updateStudentView();
				result = studentService.updateStudentValidation(student);
				StudentView.printResult(result);
				break;
			case 4:
				studentId = StudentView.findStudentView();
				result = studentService.findStudentValidation(studentId);
				StudentView.printResult(result);
				break;
			case 5:
				result = studentService.findAllStudentValidation();
				StudentView.printResult(result);
				break;

			case 6:
				department = DepartmentView.insertDepartmentView();
				result = departmentService.insertDepartmentValidation(department);
				StudentView.printResult(result);
				break;
			case 7:
				studentId = DepartmentView.deleteDepartmentView();
				result = departmentService.deleteDepartmentValidation(studentId);
				StudentView.printResult(result);
				break;
			case 8:
				department = DepartmentView.updateDepartmentView();
				result = departmentService.updateDepartmentValidation(department);
				StudentView.printResult(result);
				break;
			case 9:
				studentId = DepartmentView.findDepartmentView();
				result = departmentService.findDepartmentValidation(studentId);
				StudentView.printResult(result);
				break;
			case 10:
				result = departmentService.findAllDepartmentValidation();
				StudentView.printResult(result);
				break;

			case 11:
				System.out.println("Thank You");
				System.exit(0);
				break;
			default:
				StudentView.printInvalidChoice();

			}
			
			//Ask user to continue or not
			msg = StudentView.askToContinue();

		} while (msg.equalsIgnoreCase("Yes"));

	}

}
