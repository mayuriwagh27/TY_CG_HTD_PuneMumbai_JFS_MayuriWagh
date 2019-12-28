package com.capgemini.medicalstorecollection.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.DiscussionBean;

public class DiscussionDAOImpl implements DiscussionDAO {
	DiscussionBean dbean = null;
	DiscussionBean discussionBean = new DiscussionBean();
	public static List<DiscussionBean> discussionList = new ArrayList<DiscussionBean>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void insertQusetion(int userid) {
		int messageId = discussionList.size() + 1;
		System.out.println("Enter question you want to ask");
		String question = sc.nextLine();
		int status = 0;

		discussionBean.setUserId(userid);
		discussionBean.setQuestion(question);
		discussionBean.setStatus(status);
		discussionBean.setMessageId(messageId);
		discussionBean.setAnswer(null);
		discussionList.add(discussionBean);
	}

	@Override
	public List<DiscussionBean> getQuestion() {
		List<DiscussionBean> list = new ArrayList<DiscussionBean>();
		for (DiscussionBean bean : discussionList) {
			if (bean.getStatus() == 0) {
				this.dbean = bean;
				list.add(bean);
			}
		}

		return list;
	}

	@Override
	public List<DiscussionBean> insertAnswer(int messageId) {
		System.out.println("Enter answer to perticular question");
		String answer = sc.nextLine();
		int status = 1;

		discussionBean.setStatus(status);
		discussionBean.setAnswer(answer);
		discussionList.add(discussionBean);
		return discussionList;
	}

}// End of class
