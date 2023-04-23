package com.unit2.databaseprogramming.class8.resultsettyes;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) {

		try {
			
			String url = "jdbc:mysql://localhost:3306/six";
			String username = "Admin";
			String password = "Admin";

			String sql = "select * from employee";
			
			JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
			jdbcRowSet.setUrl(url);
			jdbcRowSet.setUsername(username);
			jdbcRowSet.setPassword(password);
			jdbcRowSet.setCommand(sql);
			jdbcRowSet.execute();
			
			System.out.println("Using jdbc rowset");
			while(jdbcRowSet.next()) {
				System.out.println("Id : "+jdbcRowSet.getInt("id") + " Name : "+jdbcRowSet.getString("firstname") + " "+jdbcRowSet.getString("middlename")+" "+ jdbcRowSet.getString("lastname"));
			}			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
