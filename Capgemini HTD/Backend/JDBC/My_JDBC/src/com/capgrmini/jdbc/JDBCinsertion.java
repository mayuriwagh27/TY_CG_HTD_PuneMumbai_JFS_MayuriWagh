package com.capgrmini.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class JDBCinsertion {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt= null;
		Scanner s= new Scanner(System.in);
		try {
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("---------------------");
			
			//Get the connection
			String dburl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=TIGER";
			conn=DriverManager.getConnection(dburl);
			System.out.println("connection established");
			System.out.println("-----------------------");
			
			//Issue SQL query via connection
			String query="INSERT INTO users_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter userid: ");
            pstmt.setInt(1, Integer.parseInt(s.nextLine()));
            System.out.println("Enter username: ");
            pstmt.setString(2, s.nextLine());
            System.out.println("Enter email: ");
            pstmt.setString(3, s.nextLine());
            System.out.println("Enter password: ");
            pstmt.setString(4, s.nextLine());
            
            int count=pstmt.executeUpdate();
            
			//Process the results
			if (count>0) {
				System.out.println("Data inderted");
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
			//close JDBC objects
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
					}
}
	}
}
