package com.capgemini.medicalstore.dao;

import java.util.List;

import com.capgemini.medicalstore.bean.DiscussionBean;

public interface DiscussionDAO {
	public void insertQusetion(int user_id);

	public List<DiscussionBean> getQuestion();

	public void answerquestion(int messageId);
}
