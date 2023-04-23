package com.unit2.databaseprogramming.class7.dbc;

import java.sql.*;

public class DatabaseConnectionDemo {

	public static void main(String[] args) {
		try {
			// com.mysql.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/six";
			String username = "Admin";
			String password = "Admin";
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
