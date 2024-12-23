package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// step -1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step -2 : Making connection with database

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");

		// step -3 : creating statement
		// normal and prepared statement
		
		//String sql = "insert into sundhar_employee values(?,?,?,?)";
		//String sql = "delete hema_emp where eid = ?";
		String sql = "update hema_emp set eid = ? where ename = ?";

		
		PreparedStatement ps = con.prepareStatement(sql);

		// step - 4 Executing the query
		
//		ps.setInt(1, 207);
//		ps.setString(2, "jai");
//		ps.setInt(3, 40000);
//		ps.setInt(4, 5);
		
		//ps.setInt(1,107);
		
		ps.setInt(1, 107);
		ps.setString(2, "malli");
		
		

		int n = ps.executeUpdate(); // insert ,delete, update(dml)

		if (n == 1) {
			System.out.println("Employee Record updated");
		} else {
			System.out.println("Employee Record Not updated");

		}

		// step -5 Closing
		ps.close();
		con.close();

	}

}
