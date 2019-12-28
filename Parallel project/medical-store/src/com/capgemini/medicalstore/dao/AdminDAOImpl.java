package com.capgemini.medicalstore.dao;

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

import com.capgemini.medicalstore.bean.AdminBean;
import com.capgemini.medicalstore.bean.UserBean;

public class AdminDAOImpl implements AdminDAO {
	PreparedStatement preparedStatement = null;
	Connection connection = null;
	FileReader reader = null;
	Properties property = null;
	AdminBean bean;
	UserBean userBean;
	ArrayList<UserBean> a = new ArrayList<UserBean>();
	Scanner sc = new Scanner(System.in);

	public AdminDAOImpl() {
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
	public AdminBean getLogin(String emailId, String password) {

		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(property.getProperty("query4"))) {
			pstmt.setString(1, emailId);
			pstmt.setString(2, password);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					bean = new AdminBean();
					bean.setEmailId(rs.getString(3));
					bean.setPassword(rs.getString(4));
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
	public List<UserBean> getUsers() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(property.getProperty("query5"))) {
			while (rs.next()) {
				userBean = new UserBean();
				userBean.setUserId(rs.getInt(1));
				userBean.setUserName(rs.getString(2));
				userBean.setEmailId(rs.getString(3));
				userBean.setPassword(rs.getString(4));
				a.add(userBean);
			}
			return a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteUser(int userId) {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"))) {
			preparedStatement = conn.prepareStatement(property.getProperty("query6"));
			preparedStatement.setInt(1, userId);
			int count = preparedStatement.executeUpdate();
			if (count != 0) {
				System.out.println("User deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
