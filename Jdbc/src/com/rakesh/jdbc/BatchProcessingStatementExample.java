package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingStatementExample {

	public static void main(String[] args) {
		try {
			
			Class.forName(Constants.MYSQL_DRIVER);
			
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL,
					Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);
			
			Statement stmt = con.createStatement();
			stmt.addBatch("Insert Into cust_tbl values(15, 'Ritika', 'Kumari');");
			stmt.addBatch("Update cust_tbl set cust_surname='Singh' where cust_surname='Rawat';");
			
			int rs[] = stmt.executeBatch();
			
			System.out.println("Number of records added " + rs[0]);
			System.out.println("Number of records updated " + rs[1]);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
