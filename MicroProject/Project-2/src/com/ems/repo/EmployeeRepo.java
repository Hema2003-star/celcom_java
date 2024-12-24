package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Hemalatha.B
 * @version 1.0 It is performing all the CRUD operations.
 */

public class EmployeeRepo {

	/**
	 * 
	 * @param employee
	 * @return boolean It is performing create employee.
	 */
	
	DepartmentRepo departmentRepo = new DepartmentRepo();
	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "insert into hema_emp values(?,?,?,?)";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			ps.setInt(4, employee.getDepartment().getDno());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Insert query not executed");
		}
		return flag;

	}

	/**
	 * 
	 * @param id
	 * @return boolean It is performing delete employee.
	 */

	public boolean doDeleteEmployee(int id) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "delete hema_emp where eid = ? ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Delete query not executed");
		}
		return flag;
	}

//
//	/**
//	 * 
//	 * @param employee
//	 * @return boolean 
//	 * It is performing update employee.
//	 */
//
	public boolean doUpdateEmployee(Employee employee) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update hema_emp set ename = ? ,esalary = ? , dno = ? where eid = ?";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setString(1, employee.getEname());
			ps.setInt(2, employee.getEsalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEid());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Update query not executed");
		}
		return flag;

	}

	/**
	 * 
	 * @param id
	 * @return Employee It is performing find employee.
	 */

	// do find method
	public Employee doFindEmployee(int id) {
		int depno;
		Employee employee = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from hema_emp where eid = ? ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				depno = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(depno);
				employee.setDepartment(department);
				
				

			}

		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}

		return employee;
	}

	/**
	 * 
	 * @return List<Employee> It is performing find all employee.
	 */

	// do find all
	public List<Employee> doFindAllEmployee() {
		int depno;
		Employee employee = null;
		List<Employee> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from hema_emp  ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				depno = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(depno);
				employee.setDepartment(department);
				list.add(employee);

			}

		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}

		return list;

	}

}
