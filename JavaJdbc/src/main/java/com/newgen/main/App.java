package com.newgen.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
		try {
			// Step 1: create a connection to mysql database
			// URL jdbc:<serverConnectionName>/databaseSchema
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newgen1", "root", "sachin909");
			
			
			// Step 2: creating a statement
			Statement stmt = connection.createStatement();
			
			// Step 3: execute and get result set
			ResultSet rs = stmt.executeQuery("select * from student");
		
			while (rs.next()) {
					// mysql column index 1: id int		2: name varchar 3: marks double
				System.out.println(rs.getInt(1) + " --- " + rs.getString(2) + " ---- " + rs.getDouble(3));
			}
				
			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}  
    
}
