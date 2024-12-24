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
 * @version 1.1 It is performing all the CRUD operations.
 */

public class DepartmentRepo {

	/**
	 * 
	 * @param department
	 * @return boolean It is performing create department.
	 */
	public boolean doInsertDepartment(Department department) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "insert into hema_department values(?,?)";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setInt(1, department.getDno());
			ps.setString(2, department.getDname());

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
	 * @return boolean It is performing delete department.
	 */

	public boolean doDeleteDepartment(int id) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "delete hema_department where dno = ? ";
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
//	 * @param department
//	 * @return boolean 
//	 * It is performing update department.
//	 */
//
	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update hema_department set dname = ? where dno = ?";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setString(1, department.getDname());
			ps.setInt(2, department.getDno());

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
	 * @return Department It is performing find department .
	 */

	// do find method
	public Department doFindDepartment(int id) {
		Department department = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from hema_department where dno = ? ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dname"));

			}

		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}

		return department;
	}

	/**
	 * 
	 * @return List<Department> It is performing find all employee on Map DB.
	 */

	// do find all
	public List<Department> doFindAllDepartment() {
		Department department = null;
		List<Department> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from hema_department  ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			    department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dname"));

				list.add(department);

			}

		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}

		return list;

	}

}
