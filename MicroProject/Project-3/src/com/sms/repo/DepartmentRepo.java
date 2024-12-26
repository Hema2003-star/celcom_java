package com.sms.repo;

import java.util.List;

import com.sms.model.Department;

public interface DepartmentRepo {
	public boolean doInsertDepartment(Department department);

	public boolean doDeleteDepartment(int id);

	public boolean doUpdateDepartment(Department department);

	public Department doFindDepartment(int id);

	public List<Department> doFindAllDepartment();

}
