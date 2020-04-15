package com.rakesh.jdbc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StoreAndGetFile {

	public static void main(String[] args) {
		try {
			
			Class.forName(Constants.MYSQL_DRIVER);
			
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL,
					Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);
			
			//Save File
			PreparedStatement ps = con.prepareStatement("insert into files values (?, ?, ?);");
			ps.setInt(1, 1);
			ps.setString(2, "Chegg Index");
			
			FileInputStream fis = new FileInputStream("F:\\Chegg CS Guidelines.docx");
			ps.setBinaryStream(3, fis, fis.available());
			
			int rowsAffected = ps.executeUpdate();
			if(rowsAffected > 0) {
				System.out.println(rowsAffected + " rows inserted");
			} else {
				System.out.println("No Rows Inserted");
			}
			fis.close();
			
			//Retrieve File
			PreparedStatement ps2 = con.prepareStatement("Select * from files;");
			ResultSet rs = ps2.executeQuery();
			rs.next();

			Blob blob = rs.getBlob(3);
			
			byte []bytes = blob.getBytes(1, (int) blob.length());
			
			FileOutputStream fos = new FileOutputStream("F:\\Guidelines2.docx");
			
			fos.write(bytes);
			
			fos.flush();
			fos.close();
			
			System.out.println("File Retrieved Successfully");
			
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
