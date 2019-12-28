package com.capgemini.medicalstorecollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.medicalstorecollection.beans.AdminBean;
import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.beans.UserBean;
import com.capgemini.medicalstorecollection.factory.AllFactory;

public class AdminDAOImpl implements AdminDAO {
	ProductDAoImpl product = new ProductDAoImpl();
	UserDAOImpl impl = new UserDAOImpl();
	ProductBean bean = new ProductBean();
	AdminBean adminBean = null;
	UserBean user = new UserBean();
	public static List<UserBean> userList=UserDAOImpl.userList;
	public static List<AdminBean> adminList;

	static {
		adminList = new ArrayList<AdminBean>();
		AdminBean admin1 = new AdminBean();
		admin1.setAdminId(1);
		admin1.setAdminName("Suraj");
		admin1.setEmailId("suraj@gmail.com");
		admin1.setPassword("suraj");
		adminList.add(admin1);

		AdminBean admin2 = new AdminBean();
		admin2.setAdminId(1);
		admin2.setAdminName("Mayuri");
		admin2.setEmailId("mayuri@gmail.com");
		admin2.setPassword("mayuri");
		adminList.add(admin2);
	}// End of static

	@Override
	public AdminBean getLogin(String emailId, String password) {
		for (AdminBean admin : adminList) {
			if (admin.getEmailId().equals(emailId)) {
				if (admin.getPassword().equals(password)) {
					this.adminBean = admin;
					break;

				} // End of if
			} // End of if

		} // End of for

		return adminBean;
	}// End of getLogin()

	@Override
	public List<UserBean> getUsers() {
		return userList;
	}// End of getUsers()

	@Override
	public boolean deleteUser(int userId) {
		System.out.println(userId);
		boolean isDeleted = false;
		for (UserBean user : userList) {
			if (user.getUserId() == userId) {
				userList.remove(user);
				isDeleted = true;
				break;
			}
		}
		return isDeleted; 
	}

}// End of class
