package com.capgrmini.jdbc;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class MyfirstJDBC {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt= null;
		ResultSet rs = null;
		try {
			//Load the driver
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded");
			System.out.println("-----------------------");
			//Get DB connection via Driver
			String dburl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=TIGER";
			
			conn=DriverManager.getConnection(dburl);
			System.out.println("connection established");
			System.out.println("-----------------------");
			
			//Issue SQL query via connection
			String query= "SELECT * FROM users_info";
			 stmt = conn.createStatement();
			rs= stmt.executeQuery(query); //inside interface statement RT:result statement(interface)
			//process the results returned by SQL query
			while(rs.next()) {
				System.out.println("user id: "+rs.getInt("userid"));
				System.out.println("user name: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("Password: "+rs.getString("password"));
				System.out.println("-----------------------");
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null ) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			if(rs!=null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}	
			}
		}

	}

}
