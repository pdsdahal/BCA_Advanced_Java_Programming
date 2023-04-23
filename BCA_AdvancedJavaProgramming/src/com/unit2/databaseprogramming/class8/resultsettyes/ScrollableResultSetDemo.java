package com.unit2.databaseprogramming.class8.resultsettyes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScrollableResultSetDemo {

	public static void main(String[] args) {

		try {
			// com.mysql.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/six";
			String username = "Admin";
			String password = "Admin";
			Connection connection = DriverManager.getConnection(url, username, password);

			String sql = "select * from employee";
			
			PreparedStatement scrollableStm = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs = scrollableStm.executeQuery();
			rs.last();
			System.out.println(" Last record : Id : "+rs.getInt("id") + " Name : "+rs.getString("firstname") + " "+rs.getString("middlename")+" "+ rs.getString("lastname"));
			
			rs.first();
			System.out.println(" first record : Id : "+rs.getInt("id") + " Name : "+rs.getString("firstname") + " "+rs.getString("middlename")+" "+ rs.getString("lastname"));
			
			rs.absolute(2);
			System.out.println(" Absolute record (2) : Id : "+rs.getInt("id") + " Name : "+rs.getString("firstname") + " "+rs.getString("middlename")+" "+ rs.getString("lastname"));
			
			rs.relative(-1);//2-1
			System.out.println(" Relative record (-1) : Id : "+rs.getInt("id") + " Name : "+rs.getString("firstname") + " "+rs.getString("middlename")+" "+ rs.getString("lastname"));
			
			
			
			
			/*
			
			while (rs.next()) {

				int id = rs.getInt("id");
				String firstName = rs.getString("firstname");
				String middlename = rs.getString("middlename");
				String lastname = rs.getString("lastname");
				String address = rs.getString("address");

				System.out.println("id : " + id + "\nName : " + firstName + " " + middlename + " " + lastname
						+ "\nAddress : " + address);
			}
			*/

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
