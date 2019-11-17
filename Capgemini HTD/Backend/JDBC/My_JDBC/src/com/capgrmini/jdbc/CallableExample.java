package com.capgrmini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableExample {

	public static void main(String[] args) {
		Connection conn=null;
		Scanner s= new Scanner(System.in);
		CallableStatement cstmt=null;
		ResultSet rs=null;
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("---------------------");
			
             //Get connection via driver
			String dburl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter userid and password");
			String user=s.nextLine();
			String password=s.nextLine();
			conn=DriverManager.getConnection(dburl,user,password);
			System.out.println("connection established");
			System.out.println("-----------------------");
			
			//Issue SQL query
			String query="call getAllinfo()";
			cstmt=conn.prepareCall(query);
			boolean b= cstmt.execute();
			
			if(b) {
				rs=cstmt.getResultSet();
				while(rs.next()) {
					System.out.println("userid: "+rs.getInt(1));
					System.out.println("username: "+rs.getString(2));
					System.out.println("email: "+rs.getString(3));
					System.out.println("password: "+rs.getString(4));
					System.out.println("--------------------");
				}
			}
			else {
				int i=cstmt.getUpdateCount();
				if(i>0) {
					System.out.println("operation successful");
				}
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

			if(cstmt!=null) {
				try {
					cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
							}
		s.close();

	}

}
}