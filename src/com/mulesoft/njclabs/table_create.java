package com.mulesoft.njclabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class table_create 
{
	public static void main(String[] args) throws Exception
	{
		String query = "CREATE TABLE movies( " + 
				"movie_name VARCHAR(20)," + 
				" actor VARCHAR(20), " + 
				" actress VARCHAR(20), " + " director VARCHAR(20), " +  "Release_Year INT )";
		
		String url = "jdbc:mysql://localhost:3301/mulesoft";
		String uname = "admin";
		String pass  = "ADMIN";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		  
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();              
		int status = st.executeUpdate(query);
		
		System.out.print(status);
	}
}
