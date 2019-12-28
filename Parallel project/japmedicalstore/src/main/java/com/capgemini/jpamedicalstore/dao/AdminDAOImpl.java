package com.capgemini.jpamedicalstore.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpamedicalstore.bean.UserLoginBean;

public class AdminDAOImpl implements AdminDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction;
	Scanner s = new Scanner(System.in);

	@Override
	public List<UserLoginBean> getAllUsers() {
		String jpql = "from UserLoginBean";
		Query query = entityManager.createQuery(jpql);
		List<UserLoginBean> usersList = query.getResultList();
		if (usersList != null) {
			return usersList;
		} else {
			return null;
		}
	}

	@Override
	public UserLoginBean login(String email, String password, String role) {

		String jpql = "from UserLoginBean where email =:email and password =:password and role ='admin'";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		UserLoginBean userBean = (UserLoginBean) query.getSingleResult();
		return userBean;
	}

}// End of class
