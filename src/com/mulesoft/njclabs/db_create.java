package com.mulesoft.njclabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class db_create
{
	public static void main(String[] args) throws Exception
	{
		String query = "CREATE DATABASE mulesoft"; 
		String url = "jdbc:mysql://localhost:3301/";
		String uname = "admin";
		String pass  = "ADMIN";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		  
		Statement st = con.createStatement();
		int status = st.executeUpdate(query);
		
		System.out.print(status);
	}
}
