package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMedaDataDemo {

	public static void main(String[] args) {
		
		try  {
			
			Class.forName(Constants.MYSQL_DRIVER);
			
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL,
					Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);
			
			Statement stmt = con.createStatement();
			String query = "Select * from  cust_tbl";
			
			ResultSet rs = stmt.executeQuery(query);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Number of Columns: " + rsmd.getColumnCount());
			System.out.println("Column One Name: " + rsmd.getColumnName(1) + ", Type: " +  rsmd.getColumnTypeName(1));
			System.out.println("Column Two Name: " + rsmd.getColumnName(2) + ", Type: " +  rsmd.getColumnTypeName(2));
			System.out.println("Column Three Name: " + rsmd.getColumnName(3) + ", Type: " +  rsmd.getColumnTypeName(3));
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
