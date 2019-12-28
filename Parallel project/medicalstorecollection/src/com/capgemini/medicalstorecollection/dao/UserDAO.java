package com.capgemini.medicalstorecollection.dao;

import java.util.List;

import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.beans.UserBean;

public interface UserDAO {
	public UserBean getLogin(String emailId, String password);

	public List<UserBean> registeUser(UserBean userBean);

	public List<UserBean> userList();

	public boolean logout();

	public void updatePassword(int userId);

}// End of Interface
