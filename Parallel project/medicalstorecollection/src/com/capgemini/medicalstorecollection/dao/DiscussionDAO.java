package com.capgemini.medicalstorecollection.dao;

import java.util.List;

import com.capgemini.medicalstorecollection.beans.DiscussionBean;

public interface DiscussionDAO {
	public void insertQusetion(int userid);

	public List<DiscussionBean> getQuestion();

	public List<DiscussionBean> insertAnswer(int messageId);

}
