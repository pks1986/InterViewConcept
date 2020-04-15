package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatementInsert {

	public static void main(String[] args) {
		try {

			Class.forName(Constants.MYSQL_DRIVER);
			
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL,
					Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);
			
			PreparedStatement ps = con.prepareStatement("Insert into cust_tbl values(?, ?, ?)");
			
			ps.setInt(1, 12);
			ps.setString(2, "Charu");
			ps.setString(3, "Verma");
			ps.executeUpdate();
			
			ps.setInt(1, 13);
			ps.setString(2, "Somil");
			ps.setString(3, "Yadav");
			ps.executeUpdate();
			
			ps.setInt(1, 14);
			ps.setString(2, "Navneet");
			ps.setString(3, "Yadav");
			ps.executeUpdate();
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("Select * from cust_tbl");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " +  rs.getString(2) + " " +  rs.getString(3));
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
