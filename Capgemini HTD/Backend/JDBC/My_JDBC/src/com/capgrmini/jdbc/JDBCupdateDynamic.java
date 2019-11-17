package com.capgrmini.jdbc;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Connection;
public class JDBCupdateDynamic {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner s= new Scanner(System.in);
		try {
			//Load Driver̥
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("---------------------");

			//get connection via Driver
			String dburl="jdbc:mysql://localhost:3306/capg_db?user=root&password=TIGER";
			conn=DriverManager.getConnection(dburl);
			System.out.println("connection established");
			System.out.println("-----------------------");


			//Issue SQL query via connection
			String query="update users_info set username=? where userid=?";
			pstmt=conn.prepareStatement(query);

			System.out.println("Enter username: ");
			pstmt.setString(1, s.nextLine());
			
			System.out.println("Enter userid: ");
			pstmt.setInt(2, Integer.parseInt(s.nextLine()));

			int count=pstmt.executeUpdate();

			//process result
			if (count>0) {
				System.out.println("Data updated");
			}
		}
		catch(Exception e) {
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

			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} s.close();
	}
}
