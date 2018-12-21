package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Database_connection {
	
	
	@Test
	public void LocalDatabase() throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");	
	
	System.out.println("Driver Loaded");
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webners","root","123456");
		
		System.out.println("connected to mqsql Db");
		
		//Create statement helps to execute any database query
		Statement smt = con.createStatement();
		
		ResultSet rs=smt.executeQuery("SELECT * FROM employee");
		
		while(rs.next())
		{
		/*String column =rs.getString("FirstName");
		System.out.println(column);
		*/
		//String column2 =rs.getString("LastName");
		System.out.println(rs.getInt(1)   +     rs.getString(2)   + rs.getString(4)  +rs.getString(5));
	}
	}
	
	 
}


