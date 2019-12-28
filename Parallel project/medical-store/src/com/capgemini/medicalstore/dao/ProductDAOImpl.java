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

public class ProductDAOImpl implements ProductDAO {

	PreparedStatement preparedStatement = null;
	Connection connection = null;
	FileReader reader = null;
	Properties property = null;
	ProductBean adminBean;

	ArrayList<ProductBean> a = new ArrayList<ProductBean>();
	Scanner sc = new Scanner(System.in);

	public ProductDAOImpl() {
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
	public List<ProductBean> getAllInfo() {

		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(property.getProperty("query"))) {
			while (rs.next()) {
				adminBean = new ProductBean();
				adminBean.setId(rs.getInt("id"));
				adminBean.setCatagory(rs.getString("category"));
				adminBean.setProduct_name(rs.getString("product_name"));
				adminBean.setAvailability(rs.getString("availability"));
				adminBean.setPrice(rs.getDouble("price"));
				a.add(adminBean);
			}
			return a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean addProduct(ProductBean product) {

		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"))) {

			preparedStatement = conn.prepareStatement(property.getProperty("query1"));
			preparedStatement.setString(1, product.getCatagory());
			preparedStatement.setString(2, product.getProduct_name());
			preparedStatement.setDouble(3, product.getPrice());
			preparedStatement.setString(4, product.getAvailability());
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void updateproduct() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"))) {
			preparedStatement = conn.prepareStatement(property.getProperty("query2"));
			System.out.println("Enter Availability: ");
			preparedStatement.setString(1, sc.next());
			System.out.println("Enter Id:");
			preparedStatement.setInt(2, sc.nextInt());

			int count = preparedStatement.executeUpdate();

			if (count > 0) {
				System.out.println("Data updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"))) {
			preparedStatement = conn.prepareStatement(property.getProperty("query3"));
			System.out.println("Enter product_name: ");
			preparedStatement.setString(1, (sc.nextLine()));
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				System.out.println("Data deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
