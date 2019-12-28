package com.capgemini.medicalstore.dao;

import java.util.List;

import com.capgemini.medicalstore.bean.AdminBean;
import com.capgemini.medicalstore.bean.UserBean;

public interface AdminDAO {

	public AdminBean getLogin(String emailId, String password);

	public List<UserBean> getUsers();
	
	public void deleteUser(int userId);
	
}
