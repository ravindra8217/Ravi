package DBConnection;

import java.sql.DriverManager;

import org.testng.annotations.Test;

/* Every database have a connector, we need to download the connector file for testing that database(mysql, oracle,...)
 * Download the zipfile (ex: mysql-connector.jar), unzip and you will find the jar file "mysql-connector.jar".
 * Add this jar file to project. select project and Right click -> Build Path -> Configure Build Path -> Add jar.
 * 
 * Pre-condition : we need to know the driver (ex: com.mysql.jdbc.Driver)
 * 
 * 



*/


public class DBconnection {
	
	@Test
	public void testDB() throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");	
		
		System.out.println("Driver loaded");
		
		//DriverManager.getConnection("jdbc:mysql://localhost:3306/wheels:,")
		
	}
	
	
	
	
	
	

}
