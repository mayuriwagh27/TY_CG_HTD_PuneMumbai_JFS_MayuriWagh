package com.capgrmini.jdbc;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC_retrival_All {

	public static void main(String[] args) {

Connection conn = null;
Properties prop = null;
FileReader reader=null; //To read the file
Statement stmt=null;
ResultSet rs=null;
try {
	reader = new FileReader("C:\\Users\\hp\\Desktop\\db.prooerties");//windows R-> right click on file move to opened window
	 prop = new Properties();// file object created
		prop.load(reader);//to load file to use its properties 
	} catch (Exception e) {
		e.printStackTrace();
	}


try {
	//Get the connection for only one DB
	String dburl = prop.getProperty("dbUrl");
	conn = DriverManager.getConnection(dburl , prop); // 3rd method to get connection
	System.out.println("Connection established");
	System.out.println("--------------------------");
	
	//issue SQL query
	String query="select * from users_info";
stmt=conn.createStatement();
rs=stmt.executeQuery(query);

//process the result
while (rs.next()) {
	System.out.println("name is:"+rs.getString("username"));
	System.out.println("ID is:"+rs.getInt("userid"));
	System.out.println("Mail is:"+rs.getString("email"));
	System.out.println("Password is: "+rs.getString("password"));
System.out.println("----------------------------------");
}
} catch (SQLException e) {
	e.printStackTrace();
}
finally {
	if(conn!=null) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	if(stmt!=null) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}

}



	}









