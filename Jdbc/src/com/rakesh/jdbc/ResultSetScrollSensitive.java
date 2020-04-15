package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollSensitive {

	public static void main(String[] args) {
		
		try {
			// Step 1 Load the Driver
			Class.forName(Constants.MYSQL_DRIVER);
		
			// Step2 get the connection object
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL,
					Constants.MYSQL_USERNAME,
					Constants.MYSQL_PASSWORD);			
			
			// Step3 create the statement object
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);		
			
			// Step4 execute query
			ResultSet rs = stmt.executeQuery("Select cust_id, cust_name from cust_tbl group by cust_name");

			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			
			// Step 4 Close the Connection
			con.close();
		} catch(SQLException | ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}
