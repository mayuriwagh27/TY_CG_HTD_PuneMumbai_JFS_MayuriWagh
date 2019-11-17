package com.capgemini.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.factory.Userfactory;
import com.capgemini.userbean.UserBeanAccount;

public class UserImplement implements Userdao{
	PreparedStatement pstmt = null;
	Connection conn = null;
	FileReader reader = null;
	Properties prop = null;
	UserBeanAccount bean;
	ArrayList<UserBeanAccount> a = new ArrayList<UserBeanAccount>();
	Scanner sc = new Scanner(System.in);
	public  UserImplement() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");		
			prop = new Properties();

			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();

		}
	
		}

	@Override
	public boolean register() {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),
				prop.getProperty("password"));
			PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query1"))){
				System.out.println("Enter User_id:");
				pstmt.setInt(1, Integer.parseInt(sc.next()));
				System.out.println("Enter User_name: ");
				pstmt.setString(2, sc.next());
				System.out.println("Enter Email: ");
				pstmt.setString(3,(sc.next()));
				System.out.println("Enter password: ");
				pstmt.setString(4, sc.next());
				
				int count = pstmt.executeUpdate();
				if(count > 0)
					System.out.println("Data inserted");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public boolean userlogin() {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),
				prop.getProperty("password"));
			PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))){
		
		System.out.println("Enter Email: ");
		String s=sc.nextLine();
		System.out.println("Enter password: ");
String p = sc.nextLine();
	System.out.println("logged in successfully");
}
catch(Exception e) {
e.printStackTrace();
}

		return false;
	}

	@Override
	public void compose() {
try {
	Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),
			prop.getProperty("password"));
	PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3"));{

		System.out.println("Enter email: ");
		String s =sc.nextLine();
		//System.out.println("Write a message");
		//String s1 =sc.nextLine();
		//System.out.println("Message sent successfully");
	}
}
	catch(Exception e) {
		e.printStackTrace();
		}


}
}



	



