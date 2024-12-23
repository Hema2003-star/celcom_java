package com.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcExample3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// step -1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step -2 : Making connection with database

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");

		// step -3 : creating statement
		// normal and prepared statement

		String sql = "insert into hema_emp values(?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);

		// step - 4 Executing the query

//		ps.setInt(1, 12);
//		ps.setString(2, "sundhar");
//		ps.setInt(3, 50000);
//		ps.setInt(4, 10);
//		ps.addBatch();
//
//		ps.setInt(1, 13);
//		ps.setString(2, "praveen");
//		ps.setInt(3, 60000);
//		ps.setInt(4, 20);
//		ps.addBatch();
//
//		ps.executeBatch();
		
		Object employee[][] = new Object[][] {
			{60,"babu",90000,10},
			{80,"raj",40000,20},
			
		};
		
		for(int i = 0 ; i<employee.length;i++) {
			ps.setInt(1, (Integer)employee[i][0]);
			ps.setString(2, (String)employee[i][1]);
			ps.setInt(3,(Integer)employee[i][2]);
			ps.setInt(4,(Integer)employee[i][3]);
			
			
			ps.addBatch();
		}
		
		ps.executeBatch();

		// step -5 Closing
		ps.close();
		con.close();

	}

}
