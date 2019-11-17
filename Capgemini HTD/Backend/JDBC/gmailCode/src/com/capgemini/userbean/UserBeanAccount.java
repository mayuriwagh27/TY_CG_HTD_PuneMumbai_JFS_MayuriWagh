package com.capgemini.userbean;

public class UserBeanAccount {
	private int User_id;
	private String User_name;
	private String  Password;
	private String Email;
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "UserBean [User_id=" + User_id + ", User_name=" + User_name + ", Password=" + Password + ", Email="
				+ Email + "]";
	};


}
