package com.capgemini.jpamedicalstore.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpamedicalstore.bean.DiscussionBean;
import com.capgemini.jpamedicalstore.bean.ProductBean;
import com.capgemini.jpamedicalstore.controller.Discussion;

public class DiscussionDAOImpl implements DiscussionDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	public static List<ProductBean> productList;
	Scanner sc = new Scanner(System.in);

	@Override
	public boolean insertQuestion(DiscussionBean discussBean) {
		transaction.begin();
		boolean inserted = false;
		entityManager.persist(discussBean);
		transaction.commit();

		inserted = true;
		return inserted;

	}

	@Override
	public List<DiscussionBean> getQuestions() {
		String jpql = "from DiscussionBean where status = 0";
		Query query = entityManager.createQuery(jpql);
		List<DiscussionBean> discussList = new ArrayList<DiscussionBean>();
		discussList = query.getResultList();
		if (discussList != null) {
			return discussList;
		} else {
			return null;
		}
	}

	@Override
	public boolean answerQuestion(DiscussionBean discussBean) {
		boolean isInserted = false;
		String jpql = "update DiscussionBean set answer =:ans , status = 1 where messageid=:msgId";
		// Discussion.answer();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("ans", discussBean.getAnswer());
		query.setParameter("msgId", discussBean.getMessageid());
		query.setParameter("status", discussBean.getStatus());
		transaction.begin();
		int res = query.executeUpdate();
		isInserted = true;
		transaction.commit();
		return isInserted;
	}

}// End of class
