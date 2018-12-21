package test;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import org.testng.annotations.Test;

	public class Pg_adminDatabase {
		
		
		@Test
		public void LocalDatabase() throws ClassNotFoundException, SQLException
		{
		Class.forName("org.postgresql.Driver");	
		
		System.out.println("Driver Loaded");
		
			Connection con = DriverManager.getConnection("jdbc:postgresql://ec2-35-172-243-183.compute-1.amazonaws.com:5432/d6psss9lguf8qp","u5l5a0bap0ut9u","pbf5a9cc4655852c7ee492d0aa14c3cef3eb19330dfe34f48984462ec0e50917e");
			
			System.out.println("connected to PgAdmin Db");
			
			//Create statement helps to execute any database query
			Statement smt = con.createStatement();
			
			ResultSet rs=smt.executeQuery("SELECT * FROM countries  where country='India' ");
			
			while(rs.next())
			{
			/*String column =rs.getString("FirstName");
			System.out.println(column);
			*/
			//String column2 =rs.getString("LastName");
			System.out.println(rs.getInt(1)   +"          "+     rs.getString(2)  +  "            " + rs.getString(3)  );
		}
		}
		
		
	}



