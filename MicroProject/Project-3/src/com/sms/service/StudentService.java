package com.sms.service;

import com.sms.model.Student;

public interface StudentService {
	public String insertStudentValidation(Student student);

	public String deleteStudentValidation(int id);

	public String updateStudentValidation(Student student);

	public String findStudentValidation(int id);

	public String findAllStudentValidation();

}
