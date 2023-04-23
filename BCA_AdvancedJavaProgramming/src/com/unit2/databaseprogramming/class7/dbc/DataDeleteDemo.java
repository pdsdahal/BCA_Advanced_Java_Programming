package com.unit2.databaseprogramming.class7.dbc;

import java.sql.*;

public class DataDeleteDemo {

	public static void main(String[] args) {
		try {
			// com.mysql.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/six";
			String username = "Admin";
			String password = "Admin";
			Connection connection = DriverManager.getConnection(url, username, password);
			
			String sql = "delete from employee where id = ?";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setInt(1, 1);
			
			int count = pstm.executeUpdate();
			
			if(count>=1) {
				System.out.println("Data Deleted Successfully!");
			}else {
				System.out.println("Failed to insert....");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}


