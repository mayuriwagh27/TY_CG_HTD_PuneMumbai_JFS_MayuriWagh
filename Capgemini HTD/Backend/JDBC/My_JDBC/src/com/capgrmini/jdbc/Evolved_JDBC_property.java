package com.capgrmini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Evolved_JDBC_property {
	public static void main(String[] args) {
FileReader reader=null;
Properties prop=null;

		try {
			//Load the driver
	reader = new FileReader("db.properties");
prop = new Properties();
prop.load(reader);
Class.forName(prop.getProperty("driverClass"));
System.out.println("Driver loaded");
System.out.println("------------------------");

}
catch(Exception e) {
	e.printStackTrace();
}
		
try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				Statement stmt =conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))){
{
while (rs.next()) {
	System.out.println("Userid is: "+rs.getInt(1));
	System.out.println("Username is: "+rs.getString(2));
	System.out.println("Email is: "+rs.getString(3));
	System.out.println("------------------------");

}
}
}
catch(Exception e) {
	e.printStackTrace();
}
		
}
	}

	














