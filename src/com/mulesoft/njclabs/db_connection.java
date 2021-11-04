package com.mulesoft.njclabs;
import java.sql.*;
public class db_connection 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3301/";
		String uname = "admin";
		String pass  = "ADMIN";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		  
		if(con!=null)		{
			System.out.print("Database is Connected ");		}
		else {
			System.out.print("DB is not connected");
		}
	}
}
