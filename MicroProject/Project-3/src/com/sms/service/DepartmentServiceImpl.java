package com.sms.service;

import com.sms.model.Department;
import com.sms.repo.DepartmentRepo;
import com.sms.repo.DepartmentRepoImpl;


/**
 * @version 1.0 It is performing Validation Service
 */

public class DepartmentServiceImpl implements DepartmentService {

	DepartmentRepo departmentRepo = new DepartmentRepoImpl(); // list repo

	/**
	 * 
	 * @param department
	 * @return String It is validating insert operation.
	 */

	public String insertDepartmentValidation(Department department) {
		String result;

		if (department == null) {
			result = "Department Object is Null ";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Department Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Department Object Saved";
			} else {
				result = "Department Object Not Saved ";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating delete operation.
	 */

	public String deleteDepartmentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Department Object Deleted";
			} else {
				result = "Department Object not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @param department
	 * @return String It is validating update operation.
	 */
	public String updateDepartmentValidation(Department department) {
		String result;

		if (department == null) {
			result = "Department Object is Null ";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Department Data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department Object Updated";
			} else {
				result = "Department Object Not Found ";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating find operation.
	 */
	public String findDepartmentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			Department department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department Object not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @return String It is performing to display all the department details
	 */
	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}

}
