package com.rakesh.jdbc;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertAndGetImage {

	public static void main(String[] args) {
		try {
			
			Class.forName(Constants.MYSQL_DRIVER);
			
			Connection con = DriverManager.getConnection(Constants.MYSQL_DATABASE_URL,
					Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWORD);
			
			/*PreparedStatement ps = con.prepareStatement("insert into images values(?, ?, ?);");
			
			ps.setInt(1, 1);
			ps.setString(2, "Profile");
			
			//Save Image
			FileInputStream fis = new FileInputStream("E:\\Mobile Internal Storage\\Pictures\\profile2.png");
			ps.setBinaryStream(3, fis, fis.available());
			int noOfRowsAffected = ps.executeUpdate();
			if(noOfRowsAffected > 0) {
				System.out.println(noOfRowsAffected  + " rows inserted");
			} else {
				System.out.println("Something went wrong");
			}
			
			fis.close();*/
			
			
			//Retrieve Image
			PreparedStatement psRead = con.prepareStatement("Select * from Images");
			
			ResultSet rs = psRead.executeQuery();
			rs.next();
			
			Blob blob = rs.getBlob(3);
			byte[] bytes = blob.getBytes(1, (int) blob.length());	//First byte is at position 1
			FileOutputStream fos = new FileOutputStream("E:\\Mobile Internal Storage\\Pictures\\profile2.png");
			fos.write(bytes);
			
			fos.close();
			
			System.out.println("File Saved Successfully");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
