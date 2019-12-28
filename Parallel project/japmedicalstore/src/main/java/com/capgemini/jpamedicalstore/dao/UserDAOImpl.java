package com.capgemini.jpamedicalstore.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpamedicalstore.bean.UserLoginBean;

public class UserDAOImpl implements UserDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction;
	Scanner s = new Scanner(System.in);

	@Override
	public boolean register(UserLoginBean userLoginBean) {
		boolean isRegistered = false;
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(userLoginBean);
		isRegistered = true;
		transaction.commit();
		return isRegistered;
	}// End of register

	@Override
	public UserLoginBean authenticate(String email, String password, String role) {
		String jpql = "from UserLoginBean where email =:email and password =:password and role ='user'";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		UserLoginBean userBean = (UserLoginBean) query.getSingleResult();
		return userBean;
	}// end of authenticate

	@Override
	public boolean changePassword(String email) {
		boolean pass = false;
		transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "update UserLoginBean set password =: pwd where email =: mail";
		Query query = entityManager.createQuery(jpql);
		System.out.println("Enter your email");
		String emailId = s.next();
		System.out.println("Enter new password");
		String password = s.next();
		query.setParameter("pwd", password);
		query.setParameter("mail", emailId);
		int res = query.executeUpdate();
		transaction.commit();
		if (res > 0) {
			pass = true;
		} else {
			pass = false;
		}
		return pass;
	}

}// End of class
