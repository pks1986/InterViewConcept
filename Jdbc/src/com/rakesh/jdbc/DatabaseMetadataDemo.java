package com.rakesh.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetadataDemo {

	public static void main(String[] args) {

		try {
			
			Class.forName(Constants.MYSQL_DRIVER);
			
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL, Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println("DB Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("DB Version: " + dbmd.getDatabaseProductVersion());
			System.out.println("DB Minor Version: " + dbmd.getDatabaseMinorVersion());
			System.out.println("DB Major Version: " + dbmd.getDatabaseMajorVersion());
			System.out.println("DB Driver Name: " + dbmd.getDriverName());
			System.out.println("DB Username: " + dbmd.getUserName());
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
