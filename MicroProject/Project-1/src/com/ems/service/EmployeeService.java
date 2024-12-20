package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.repo.EmployeeRepo1;

/**
 * @version 1.0 
 * It is performing Validation Service
 */

public class EmployeeService {

	// EmployeeRepo employeeRepo = new EmployeeRepo(); // list repo
	EmployeeRepo1 employeeRepo = new EmployeeRepo1(); // map repo

	/**
	 * 
	 * @param Employee
	 * @return String 
	 * It is validating insert operation.
	 */

	public String insertValidation(Employee employee) {
		String result;

		if (employee == null) {
			result = "Employee Object is Null ";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsert(employee);
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not Saved ";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String 
	 * It is validating delete operation.
	 */

	public String deleteValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee Object Deleted";
			} else {
				result = "Employee Object not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @param employee
	 * @return String 
	 * It is validating update operation.
	 */
	public String updateValidation(Employee employee) {
		String result;

		if (employee == null) {
			result = "Employee Object is Null ";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdate(employee);
			if (flag) {
				result = "Employee Object Updated";
			} else {
				result = "Employee Object Not Found ";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String 
	 * It is validating find operation.
	 */
	public String findValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee Object not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @return String 
	 * It is performing to display all the employee details
	 */
	public String findAllValidation() {
		return employeeRepo.doFindAll().toString();
	}

}
