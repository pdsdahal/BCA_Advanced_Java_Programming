package com.unit2.databaseprogramming.class7.dbc;

import java.sql.*;

public class DataSelectDemo {

	public static void main(String[] args) {
		try {
			
			//register driver - 2
			// com.mysql.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/six";
			String username = "Admin";
			String password = "Admin";
			
			//create connection - 3
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//create statement - 4
			Statement statement =  connection.createStatement();

			//execute Statement - 5
			String sql = "select * from employee";
			ResultSet rs =  statement.executeQuery(sql);
			
			//processing data - 6
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String firstName = rs.getString("firstname");
				String middlename = rs.getString("middlename");
				String lastname = rs.getString("lastname");
				String address = rs.getString("address");
				
				System.out.println("id : "+id +"\nName : "+firstName + " "+middlename + " "+lastname + "\nAddress : "+address);
			}
			//close  7
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
}
