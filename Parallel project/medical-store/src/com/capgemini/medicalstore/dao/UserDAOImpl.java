package com.capgemini.medicalstore.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.medicalstore.bean.ProductBean;
import com.capgemini.medicalstore.bean.UserBean;
import com.capgemini.medicalstore.controller.GetUserLogin;
import com.capgemini.medicalstore.controller.MainTest;
import com.capgemini.medicalstore.controller.ValidationController;
import com.capgemini.medicalstore.factory.AllFactory;
import com.capgemini.medicalstore.validation.ValidationDAO;

public class UserDAOImpl implements UserDAO {
	PreparedStatement preparedStatement = null;
	Connection connection = null;
	FileReader reader = null;
	Properties property = null;
	UserBean bean;
	ProductBean productBean;
	Scanner sc = new Scanner(System.in);
	ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	ValidationDAO valid = AllFactory.validation();

	public UserDAOImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			property = new Properties();

			property.load(reader);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public UserBean getRegister() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(property.getProperty("query8"))) {

			System.out.println("Enter Your Name: ");
			String name = sc.nextLine();
			if (valid.nameValidation(name)) {
				pstmt.setString(1, name);
			} else {
				System.out.println("Please Enter valid Name");
				getRegister();
			}

			String emailId = ValidationController.emailId();
			pstmt.setString(2, emailId);

			String password = ValidationController.password();
			pstmt.setString(3, password);

			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("Registered successfully...");
			} else {
				System.out.println("something went wrong...");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("Moving to Login process");
		}
		return null;
	}

	@Override
	public UserBean getLogin(String emailId, String password) {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(property.getProperty("query7"))) {
			pstmt.setString(1, emailId);
			pstmt.setString(2, password);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					bean = new UserBean();
					bean.setEmailId(rs.getString(1));
					bean.setPassword(rs.getString(2));
				}
				return bean;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;

	}

	@Override
	public List<ProductBean> getAllInfo() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(property.getProperty("query"))) {
			while (rs.next()) {
				productBean = new ProductBean();
				productBean.setId(rs.getInt("id"));
				productBean.setCatagory(rs.getString("category"));
				productBean.setProduct_name(rs.getString("product_name"));
				productBean.setAvailability(rs.getString("availability"));
				productBean.setPrice(rs.getDouble("price"));
				al.add(productBean);
			}
			return al;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updatePassword() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"))) {
			preparedStatement = conn.prepareStatement(property.getProperty("query9"));
			System.out.println("Enter your Mail Id: ");
			preparedStatement.setString(2, sc.next());
			System.out.println("Enter new password:  ");
			preparedStatement.setString(1, sc.next());

			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				System.out.println("Your password has been changed");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public boolean logout() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"))) {
			preparedStatement = conn.prepareStatement(property.getProperty("query16"));

			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				System.out.println("Thank you...");
				System.out.println("Visit again");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
