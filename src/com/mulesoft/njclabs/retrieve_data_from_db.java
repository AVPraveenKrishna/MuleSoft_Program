package com.mulesoft.njclabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class retrieve_data_from_db 
{
	public static void main(String[] args) throws Exception
	{ 
		String url = "jdbc:mysql://localhost:3301/";
		String uname = "admin";
		String pass  = "ADMIN";

		String query = "SELECT * FROM movies"; 
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			String tuple = rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getInt(5);
			System.out.println(tuple);			
		}
		
		st.close();
		con.close();
	}
}