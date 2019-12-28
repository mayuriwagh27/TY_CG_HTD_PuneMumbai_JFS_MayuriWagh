package com.capgemini.medicalstore.dao;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.medicalstore.bean.DiscussionBean;

public class DiscussionDAOImpl implements DiscussionDAO {
	PreparedStatement preparedStatement;
	Connection connection;
	Properties property;
	FileReader reader;
	Statement statement;
	ResultSet resultSet;
	ArrayList<DiscussionBean> discussionList;
	DiscussionBean discussionBean;
	Scanner sc = new Scanner(System.in);

	public DiscussionDAOImpl() {
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
	public void insertQusetion(int user_id) {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(property.getProperty("query13"))) {
			pstmt.setInt(1, user_id);
			System.out.println("Enter Question");

			pstmt.setString(2, sc.nextLine());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("Question updated successfully indiscussion board");
			} else {
				System.out.println("Question could not be uploaded");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public List<DiscussionBean> getQuestion() {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password")); Statement stmt = conn.createStatement()) {
			resultSet = stmt.executeQuery(property.getProperty("query14"));
			discussionList = new ArrayList<DiscussionBean>();
			while (resultSet.next()) {
				discussionBean = new DiscussionBean();
				discussionBean.setMessageId(resultSet.getInt(1));
				discussionBean.setQuestion(resultSet.getString(3));
				discussionBean.setStatus(resultSet.getInt(4));
				discussionBean.setuserId(resultSet.getInt(2));
				discussionBean.setAnswer(resultSet.getString(5));
				discussionList.add(discussionBean);
			}
			return discussionList;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void answerquestion(int messageId) {
		try (Connection conn = DriverManager.getConnection(property.getProperty("dbUrl"), property.getProperty("user"),
				property.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(property.getProperty("query15"))) {
			System.out.println("Enter an Answer");
			pstmt.setString(1, sc.nextLine());
			pstmt.setInt(2, messageId);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("Answer updated in discussion board");
			} else {
				System.out.println("Answer didn't update.... something went wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
