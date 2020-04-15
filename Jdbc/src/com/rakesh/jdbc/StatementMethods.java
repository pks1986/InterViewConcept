package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementMethods {

	public static void main(String[] args) {
		try {
			// step1 load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL, Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			int rowsAffected = stmt.executeUpdate("update cust_tbl set cust_name='Dinesh', cust_surname='Jakhar' where cust_id=2");
			System.out.println("Rows Affected: " + rowsAffected);
			
			System.out.println("\nAfter Update, Data:");
			
			ResultSet rs = stmt.executeQuery("Select * from cust_tbl");
			
			while(rs.next()) {
				System.out.println(rs.getInt("cust_id") + " " + rs.getString("cust_name") + " " + rs.getString("cust_surname"));
			}
			
			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
