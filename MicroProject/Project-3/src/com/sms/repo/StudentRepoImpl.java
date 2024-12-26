package com.sms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.sms.model.Department;
import com.sms.model.Student;
import com.sms.util.DBUtil;

/**
 * @author Hemalatha.B
 * @version 1.0 It is performing all the CRUD operations.
 */
public class StudentRepoImpl implements StudentRepo {

	/**
	 * 
	 * @param student
	 * @return boolean It is performing create student.
	 */

	DepartmentRepo departmentRepo = new DepartmentRepoImpl();

	public boolean doInsertStudent(Student student) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "insert into hemaa_student values(?,?,?,?,?,?)";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setInt(1, student.getId());
			ps.setString(2, student.getFirstName());
			ps.setString(3, student.getFirstName());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getAddress());
			ps.setInt(6, student.getDepartment().getDno());

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
	 * @param Id
	 * @return boolean It is performing delete student.
	 */

	public boolean doDeleteStudent(int Id) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "delete hemaa_student where s_Id = ? ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setInt(1, Id);

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Delete query not executed");
		}
		return flag;
	}

	/**
	 * 
	 * @param student
	 * @return boolean It is performing update student.
	 */

	public boolean doUpdateStudent(Student student) {
		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update hemaa_student set s_FirstName = ? ,s_LastName= ?, s_email =?,s_address =?, dno = ? where s_Id = ?";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ps.setString(1, student.getFirstName());
			ps.setString(2, student.getLastName());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getAddress());
			ps.setInt(5, student.getDepartment().getDno());
			ps.setInt(6, student.getId());

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
	 * @return Student It is performing find student.
	 */

	public Student doFindStudent(int Id) {
		int depno;
		Student student = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from hemaa_student where s_Id = ? ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);
			ps.setInt(1, Id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("s_Id"));
				student.setFirstName(rs.getString("s_FirstName"));
				student.setLastName(rs.getString("s_LastName"));
				student.setEmail(rs.getString("s_email"));
				student.setAddress(rs.getString("s_address"));

				depno = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(depno);
				student.setDepartment(department);

			}

		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}

		return student;
	}

	/**
	 * 
	 * @return List<Student> It is performing find all student.
	 */

	
	public List<Student> doFindAllStudent() {
		int depno;
		Student student = null;
		List<Student> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from hemaa_student  ";
			PreparedStatement ps;

			ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("s_Id"));
				student.setFirstName(rs.getString("s_FirstName"));
				student.setLastName(rs.getString("s_LastName"));
				student.setEmail(rs.getString("s_email"));
				student.setAddress(rs.getString("s_address"));

				depno = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(depno);
				student.setDepartment(department);
				list.add(student);

			}

		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}

		return list;

	}

}
