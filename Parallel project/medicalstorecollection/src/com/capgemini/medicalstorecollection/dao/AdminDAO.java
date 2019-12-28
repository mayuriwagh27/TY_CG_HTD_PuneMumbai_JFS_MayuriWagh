package com.capgemini.medicalstorecollection.dao;

import java.util.List;

import com.capgemini.medicalstorecollection.beans.AdminBean;
import com.capgemini.medicalstorecollection.beans.UserBean;

public interface AdminDAO {
	public AdminBean getLogin(String emailId, String password);

	public List<UserBean> getUsers();

	public boolean deleteUser(int userId);

}// End of Interface
