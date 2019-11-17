package com.capgemini.JDBC.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.JDBC.beans.UserBean;

public class userDAO_Implement implements userDAO {
	Connection conn = null;
	FileReader reader = null;
	Properties prop = null;
	UserBean user;
public userDAO_Implement() {
	
	
	try {
	
		Class.forName("com.mysql.jdbc.Driver");      //driver loading
		reader = new FileReader("db.properties");
		prop = new Properties();
		prop.load(reader);                         //loading file
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	@Override
	public UserBean getinfo(int userid) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query2")))
		{
			pstmt.setInt(1 ,userid);
			try(ResultSet rs=pstmt.executeQuery()){
				if(rs.next()) {
					user= new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				
                      }
				return user;
			}catch(Exception e) {
				e.printStackTrace();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public UserBean userLogin(int userid, String password) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt =conn.prepareStatement(prop.getProperty("query3")))
		{
			pstmt.setInt(1 ,userid);
			pstmt.setString(2,password);
			try(ResultSet rs=pstmt.executeQuery()){
				if(rs.next()) {
					user= new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				


				}
				return user;
			}catch(Exception e) {
				e.printStackTrace();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	@Override
	public List<UserBean> getAllinfo() {
		ArrayList<UserBean> al = new ArrayList<UserBean>();
			try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
					Statement stmt =conn.createStatement();
			ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
					while(rs.next()) {
						user= new UserBean();
						user.setUserid(rs.getInt(1));
						user.setUsername(rs.getString(2));
						user.setEmail(rs.getString(3));
						
						al.add(user);
					}
					return al ;
				}catch(Exception e) {
					e.printStackTrace();
				}

			
		return null;
	}
	

}
