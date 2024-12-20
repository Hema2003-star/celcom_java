package com.ems.repo;

import java.util.Iterator;
import java.util.List;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Hemalatha.B
 * @version 1.0 
 * It is performing all the CRUD operations on Map DB.
 */

public class EmployeeRepo {

	/**
	 * 
	 * @param employee
	 * @return boolean 
	 * It is performing create employee on Map DB.
	 */
	public boolean doInsert(Employee employee) {

		List<Employee> list = DBUtil.getListDBInstance();

		return list.add(employee); // return true or false

	}

	/**
	 * 
	 * @param id
	 * @return boolean 
	 * It is performing delete employee on Map DB.
	 */

	public boolean doDelete(int id) {
		boolean flag = false;
		List<Employee> list = DBUtil.getListDBInstance();

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEid() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;

	}

	/**
	 * 
	 * @param employee
	 * @return boolean 
	 * It is performing update employee on Map DB.
	 */

	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		int index = 0;
		List<Employee> list = DBUtil.getListDBInstance();

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEid() == employee.getEid()) {
				list.set(index, employee);
				flag = true;
				break;
			}
			index++;
		}
		return flag;

	}

	/**
	 * 
	 * @param id
	 * @return Employee 
	 * It is performing find employee on Map DB.
	 */

	// do find method
	public Employee doFind(int id) {
		Employee employee = null;
		List<Employee> list = DBUtil.getListDBInstance();

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEid() == id) {
				employee = temp;
				break;
			}
		}
		return employee;

	}

	/**
	 * 
	 * @return List<Employee> 
	 * It is performing find all employee on Map DB.
	 */

	// do find all
	public List<Employee> doFindAll() {
		return DBUtil.getListDBInstance();

	}

}
