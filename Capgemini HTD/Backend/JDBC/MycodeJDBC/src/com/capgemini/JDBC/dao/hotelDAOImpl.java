package com.capgemini.JDBC.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.JDBC.hotel.Hotel;

public class hotelDAOImpl implements hotelDAO {
	PreparedStatement pstmt = null;
	Connection conn = null;
	FileReader reader = null;
	Properties prop = null;
	Hotel hotel;
	ArrayList<Hotel> a = new ArrayList<Hotel>();
	Scanner sc = new Scanner(System.in);
	public  hotelDAOImpl() {
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
	public List<Hotel> getAllInfo() {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))){
			while (rs.next()) {
				hotel= new Hotel();
				hotel.setItem_code(rs.getInt("Item_code"));
				hotel.setFood_name(rs.getString("Food_name"));
				hotel.setPrice(rs.getDouble("Price"));
				a.add(hotel);
			}
			return a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;


	}

	@Override
	public  boolean Add() {
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),
				prop.getProperty("password"))){

			pstmt = conn.prepareStatement(prop.getProperty("query2"));
			System.out.println("Enter Item_code: ");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Food_name: ");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter Price: ");
			pstmt.setDouble(3, Double.parseDouble(sc.nextLine()));
			int count=pstmt.executeUpdate();
			if (count>0) {
				System.out.println("Data inserted");
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void delete() {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),
				prop.getProperty("password"))){
			pstmt  = conn.prepareStatement(prop.getProperty("query3"));
			System.out.println("Enter Food_name: ");
			pstmt.setString(1,(sc.nextLine()));
			int count=pstmt.executeUpdate();
			if (count>0) {
				System.out.println("Data deleted");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update() {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),
				prop.getProperty("password"))){
			pstmt=conn.prepareStatement(prop.getProperty("query4"));
System.out.println("Enter item code");
pstmt.setInt(2, sc.nextInt());
			System.out.println("Enter Food_name: ");
			pstmt.setString(1, sc.next());

			int count=pstmt.executeUpdate();

			if (count>0) {
				System.out.println("Data updated");
			}
		}
		catch(Exception e) {
			e.printStackTrace();		
		}	
	}
	}


















