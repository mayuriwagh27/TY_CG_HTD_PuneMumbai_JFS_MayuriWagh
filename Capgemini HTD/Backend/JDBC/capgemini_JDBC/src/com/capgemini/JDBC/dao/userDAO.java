package com.capgemini.JDBC.dao;

import java.util.List;

import com.capgemini.JDBC.beans.UserBean;

public interface userDAO { //Interface (DAO-Data Access Object)
public List<UserBean> getAllinfo();
public UserBean getinfo(int userid);
public UserBean userLogin(int userid, String password);

}
