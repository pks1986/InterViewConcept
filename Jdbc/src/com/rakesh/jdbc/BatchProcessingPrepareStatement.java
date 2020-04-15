package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchProcessingPrepareStatement {

	public static void main(String[] args) {
		try {

			Class.forName(Constants.MYSQL_DRIVER);

			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL, Constants.MYSQL_USERNAME,
					Constants.MYSQL_PASSWORD);

			PreparedStatement ps = con.prepareStatement("Insert Into cust_tbl values(?, ?, ?);");
			ps.setInt(1, 16);
			ps.setString(2, "Sunil");
			ps.setString(3, "Kumar");
			
			ps.addBatch();
			
			ps.setInt(1, 17);
			ps.setString(2, "Satish");
			ps.setString(3, "Kumar");
			
			ps.addBatch();
			
			ps.executeBatch();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
