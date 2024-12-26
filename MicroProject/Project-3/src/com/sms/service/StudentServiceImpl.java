package com.sms.service;

import com.sms.model.Student;
import com.sms.repo.StudentRepo;
import com.sms.repo.StudentRepoImpl;

/**
 * @version 1.0 It is performing Validation Service
 */
public class StudentServiceImpl implements StudentService {

	StudentRepo studentRepo = new StudentRepoImpl(); // list repo

	/**
	 * 
	 * @param Student
	 * @return String It is validating insert operation.
	 */

	public String insertStudentValidation(Student student) {
		String result;

		if (student == null) {
			result = "Student Object is Null ";
		} else if (student.getId() == 0 || student.getFirstName() == null || student.getLastName() == null
				|| student.getEmail() == null || student.getAddress() == null
				|| student.getDepartment().getDno() == 0) {
			result = "Invalid Student Data";
		} else {
			boolean flag = studentRepo.doInsertStudent(student);
			if (flag) {
				result = "Student Object Saved";
			} else {
				result = "Student Object Not Saved ";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating delete operation.
	 */

	public String deleteStudentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = studentRepo.doDeleteStudent(id);
			if (flag) {
				result = "Student Object Deleted";
			} else {
				result = "Student Object not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @param student
	 * @return String It is validating update operation.
	 */
	public String updateStudentValidation(Student student) {
		String result;

		if (student == null) {
			result = "Student Object is Null ";
		} else if (student.getId() == 0 || student.getFirstName() == null || student.getLastName() == null
				|| student.getEmail() == null || student.getAddress() == null
				|| student.getDepartment().getDno() == 0) {
			result = "Invalid Student Data";
		} else {
			boolean flag = studentRepo.doUpdateStudent(student);
			if (flag) {
				result = "Student Object Updated";
			} else {
				result = "Student Object Not Found ";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating find operation.
	 */
	public String findStudentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			Student student = studentRepo.doFindStudent(id);
			if (student != null) {
				result = student.toString();
			} else {
				result = "Student Object not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @return String It is performing to display all the employee details
	 */
	public String findAllStudentValidation() {
		return studentRepo.doFindAllStudent().toString();
	}

}
