package com.capgemini.JDBC.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.JDBC.beans.UserBean;
import com.capgemini.JDBC.dao.userDAO;
import com.capgemini.JDBC.factory.userFactory;

public class GetInfo {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
userDAO dao = userFactory.getInstance();      //calling
/*System.out.println("Enter userid");
UserBean user = dao.getinfo(s.nextInt());
if (user!=null) {
	System.out.println(user);
}
else {
	System.out.println("Something went wrong..");
}
s.close();*/                                               //can use anyone





/*System.out.println("Enter userid and password");                     
UserBean user2 = dao.userLogin(s.nextInt(),s.next());
if (user2!=null) {
	System.out.println(user2);
}
else {
	System.out.println("Something went wrong..");
}
s.close();  */




List<UserBean> li = dao.getAllinfo();
if(li != null) {
	for(UserBean user : li) {
		System.out.println(user);
	}
}
	else {
		System.out.println("Somethig went wrong ");
	}
}

	}