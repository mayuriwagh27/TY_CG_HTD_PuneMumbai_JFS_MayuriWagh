package com.capgemini.jpamedicalstore.dao;

import java.util.List;
import com.capgemini.jpamedicalstore.bean.UserLoginBean;

public interface AdminDAO {
	public UserLoginBean login(String email, String password, String role);

	public List<UserLoginBean> getAllUsers();

}// End of interface
