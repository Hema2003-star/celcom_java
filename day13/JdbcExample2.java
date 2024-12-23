package com.day13;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcExample2 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {

			// step -1 : Loading Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step -2 : Making connection with database

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
					"training", "Celcom123");
			//info about database
			DatabaseMetaData dbData = con.getMetaData() ;
			System.out.println(dbData.getDriverName());
			System.out.println(dbData.getDriverVersion());

			// step -3 : creating statement
			// normal and prepared statement
			
			String sql = "select * from hema_emp";

			
			PreparedStatement ps = con.prepareStatement(sql);

			// step - 4 Executing the query

			ResultSet rs = ps.executeQuery();
			//result about metadata
			ResultSetMetaData rsData = rs.getMetaData();
			System.out.println(rsData.getColumnCount());
			for(int i = 1 ; i <= rsData.getColumnCount() ; i++) {
				System.out.println(rsData.getColumnName(i));
			}
			
			
			while(rs.next()) {
				System.out.println(rs.getInt("eid") +" "+rs.getString("ename")+" "+rs.getInt("esalary") );
			}
			// step -5 Closing
			ps.close();
			con.close();
			rs.close();
			

		}

	}


