package com.capgemini.userbean;

public class UserBeanInbox {
	private int Message_id;
	private int User_id;
	private String Message;
	public int getMessage_id() {
		return Message_id;
	}
	public void setMessage_id(int message_id) {
		Message_id = message_id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "UserBeanInbox [Message_id=" + Message_id + ", User_id=" + User_id + ", Message=" + Message + "]";
	}

}
