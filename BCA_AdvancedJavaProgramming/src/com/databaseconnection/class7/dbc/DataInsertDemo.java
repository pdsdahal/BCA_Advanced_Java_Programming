package com.databaseconnection.class7.dbc;

import java.sql.*;

public class DataInsertDemo {

	public static void main(String[] args) {
		try {
			// com.mysql.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/six";
			String username = "Admin";
			String password = "Admin";
			Connection connection = DriverManager.getConnection(url, username, password);
			
			String sql = "insert into employee (firstname,lastname,middlename,address) values(?,?,?,?)";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, "Sita");
			pstm.setString(2, "Shrestha");
			pstm.setString(3, "pd");
			pstm.setString(4, "Dolakha");
			
			int count = pstm.executeUpdate();
			
			if(count>=1) {
				System.out.println("Data Inserted Successfully!");
			}else {
				System.out.println("Failed to insert....");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
