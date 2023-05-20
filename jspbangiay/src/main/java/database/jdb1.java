package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class jdb1 {
public static Connection getconnection()
{
Connection c= null;
try {
	DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
	String url="jdbc:mySQL://localhost:3306/myweb"; 
	String username="root";
	String password="";
	c=DriverManager.getConnection(url, username, password);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return c;
}
public static void closeconntection(Connection c)
{
	try {
		if(c!=null)
		{
			c.close();
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
public static void printinfo(Connection c)
{
	
	{
		try {
			if(c!=null)
			{
				DatabaseMetaData mtdt = c.getMetaData();
			System.out.println( mtdt.getDatabaseProductName());
			System.out.println( mtdt.getDatabaseProductVersion());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
