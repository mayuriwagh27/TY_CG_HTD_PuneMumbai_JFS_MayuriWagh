package com.capgemini.JDBC.beans;

public class UserBean {
	private int userid;
	private String username;
	private String email;
	private String password;
	
	public int getUserid() {                  //Generate getters & setters
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//source -> Generate toString()
	@Override 
	public String toString() {
		return "UserBean [userid=" + userid + ", username=" + username + ", email=" + email +"]";
	}
	

}
