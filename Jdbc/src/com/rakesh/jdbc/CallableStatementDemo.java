package com.rakesh.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementDemo {

	public static void main(String[] args) {
		try  {
			
			Class.forName(Constants.MYSQL_DRIVER);
			
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL,
					Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);
			
			CallableStatement cs = con.prepareCall("{call GetAllEmployees()}");
			
			ResultSet rs = cs.executeQuery();
			
			System.out.println("\nData returned from Stored procedure\n");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +  rs.getString(3));
			}
			
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
