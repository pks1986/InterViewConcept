package com.rakesh.jdbc;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetExample {

	public static void main(String[] args) {
		try  {
			Class.forName(Constants.MYSQL_DRIVER);
			
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			
			rowSet.setUrl(Constants.MYSQL_DATABASE_URL);
			rowSet.setUsername(Constants.MYSQL_USERNAME);
			rowSet.setPassword(Constants.MYSQL_PASSWORD);
			
			rowSet.setCommand("Select * from cust_tbl;");
			rowSet.execute();
			
			rowSet.addRowSetListener(new RowSetListener() {
				
				@Override
				public void rowSetChanged(RowSetEvent event) {
					System.out.println("rowSetChanged");
				}
				
				@Override
				public void rowChanged(RowSetEvent event) {
					System.out.println("rowChanged");
					
				}
				
				@Override
				public void cursorMoved(RowSetEvent event) {
					System.out.println("cursorMoved");
				}
			});
			
			while(rowSet.next()) {
				System.out.println(rowSet.getInt(1) + " " + rowSet.getString(2) + " " +  rowSet.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
