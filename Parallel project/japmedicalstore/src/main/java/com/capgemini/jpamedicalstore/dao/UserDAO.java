package com.capgemini.jpamedicalstore.dao;

import com.capgemini.jpamedicalstore.bean.UserLoginBean;

public interface UserDAO {
	public boolean register(UserLoginBean userLoginBean);

	public UserLoginBean authenticate(String email, String password, String role);

	public boolean changePassword(String email);

}// End of interface
