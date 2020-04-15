package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnect {

	public static void main(String[] args) {
		try {
			// step1 load the driver class
			Class.forName(Constants.MYSQL_DRIVER);

			// step2 get the connection object
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL, Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from cust_tbl");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
