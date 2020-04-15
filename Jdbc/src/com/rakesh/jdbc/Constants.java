package com.rakesh.jdbc;

public interface Constants {
	
	int ORACLE_PORT = 8080;
	int MYSQL_PORT = 3306;
	
	String ORACLE_DB = "";
	String MYSQL_DB = "employees";
	
	String ORACLE_DRIVER="oracle.jdbc.driver.OracleDriver";
	String ORACLE_DATABASE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String ORACLE_USERNAME = "system";
	String ORACLE_PASSWORD = "tiger";
	
	String MYSQL_DRIVER = "com.mysql.jdbc.Driver";	
	String MYSQL_DATABASE_URL = "jdbc:mysql://localhost:" + MYSQL_PORT + "/" + MYSQL_DB;
	String MYSQL_USERNAME = "root";
	String MYSQL_PASSWORD = "mysql";
	
}
