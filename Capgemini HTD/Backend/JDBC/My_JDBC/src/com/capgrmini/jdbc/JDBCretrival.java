package com.capgrmini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCretrival {

	public static void main(String[] args) {

		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner sc= new Scanner(System.in);
		ResultSet rs =  null;
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver"); // 2nd method to get connection
			System.out.println("Driver loaded");
			System.out.println("---------------------");

			//Get the connection
			String dburl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=TIGER";
			conn=DriverManager.getConnection(dburl);
			System.out.println("connection established");
			System.out.println("-----------------------");

			//Issue SQL query via connection
			String query="select * from users_info where userid=?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the user Id...");
			pstmt.setInt(1, sc.nextInt()); 
			rs = pstmt.executeQuery();

			//Process the results
			if (rs.next()) {
				System.out.println("User Id:"+rs.getInt(1));
				System.out.println("user name: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("Password: "+rs.getString("password"));
				System.out.println("-----------------------");
			}
			else{
				System.out.println("Something went wrong");
			}
		
	} catch (Exception e) {
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

		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
	}
		sc.close();
}

}
