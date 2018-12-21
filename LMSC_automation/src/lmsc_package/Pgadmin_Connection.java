package lmsc_package;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	import org.testng.annotations.Test;
	
	public class Pgadmin_Connection {


		
		
		@Test
		public Statement LocalDatabase() throws ClassNotFoundException, SQLException
		{
		Class.forName("org.postgresql.Driver");	
		
		System.out.println("Driver Loaded");
		
			Connection con = DriverManager.getConnection("jdbc:postgresql://ec2-35-172-243-183.compute-1.amazonaws.com:5432/d6psss9lguf8qp","u5l5a0bap0ut9u","pbf5a9cc4655852c7ee492d0aa14c3cef3eb19330dfe34f48984462ec0e50917e");
			
			System.out.println("connected to PgAdmin Db");
			
			//Create statement helps to execute any database query
			Statement smt = con.createStatement();
			return smt;

}
}