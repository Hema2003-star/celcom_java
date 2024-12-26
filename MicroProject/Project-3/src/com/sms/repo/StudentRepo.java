package com.sms.repo;

import java.util.List;

import com.sms.model.Student;

public interface StudentRepo {

	public boolean doInsertStudent(Student student) ;

	public boolean doDeleteStudent(int Id) ;

	public boolean doUpdateStudent(Student student);

	public Student doFindStudent(int Id) ;
	
	public List<Student> doFindAllStudent() ;
}
