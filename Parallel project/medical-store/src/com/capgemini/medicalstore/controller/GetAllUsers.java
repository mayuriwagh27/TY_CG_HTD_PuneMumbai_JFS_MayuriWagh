package com.capgemini.medicalstore.controller;

import java.util.List;

import com.capgemini.medicalstore.bean.UserBean;
import com.capgemini.medicalstore.dao.AdminDAO;
import com.capgemini.medicalstore.factory.AllFactory;

public class GetAllUsers {

	public static void getAllUsers() {
		AdminDAO dao = AllFactory.getDAOInstance1();
		List<UserBean> li = dao.getUsers();
		if(li != null) {
			System.out.println("User Id  |  User Name  |  Email Id ");
			for(UserBean bean : li) {
				System.out.print(""+ bean.getUserId());
				System.out.print("\t     "+ bean.getUserName());
				System.out.println("\t  "+ bean.getEmailId());
				}
		}
			else {
				System.out.println("Something went wrong");
			}
		}
	}

