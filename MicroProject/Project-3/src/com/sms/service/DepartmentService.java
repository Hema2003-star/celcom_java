package com.sms.service;

import com.sms.model.Department;

public interface DepartmentService {
	public String insertDepartmentValidation(Department department);

	public String deleteDepartmentValidation(int id);

	public String updateDepartmentValidation(Department department);

	public String findDepartmentValidation(int id);

	public String findAllDepartmentValidation();
}
