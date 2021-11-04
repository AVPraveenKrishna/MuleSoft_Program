package com.mulesoft.njclabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert_data_into_table 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3301/mulesoft";
		String uname = "admin";
		String pass  = "ADMIN";
		String query = "INSERT INTO movies values('Inception','Matthew','Marion','Nolan',2010)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		  
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count+" row(s) affected/");
		
		st.close();
		con.close();
	}
}
