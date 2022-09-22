package com.quinnox.webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ApollaDatabaseConnection {
	
	public static final String URL = "database-1.coymdwbthf9t.ap-south-1.rds.amazonaws.com";
	public static final String user = "admin";
	public static final String password = "123456789";
	
	public static Connection getconnection() throws SQLException, ClassNotFoundException{
		
		System.out.println("Connecting to ApollaHospital");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(URL,user,password);
		if(conn.isValid(3)) {
			System.out.println("Connected to Database");
		}
		return conn;
		
	}

}
