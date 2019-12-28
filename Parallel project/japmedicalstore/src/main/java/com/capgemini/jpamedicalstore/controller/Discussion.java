package com.capgemini.jpamedicalstore.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.jpamedicalstore.bean.DiscussionBean;
import com.capgemini.jpamedicalstore.dao.DiscussionDAO;
import com.capgemini.jpamedicalstore.factory.AllFactory;

public class Discussion {
	static Scanner s = new Scanner(System.in);
	static DiscussionDAO dao = AllFactory.getDiscussionInstance();
	static DiscussionBean discussBean = new DiscussionBean();

	public static void question() {
		System.out.println("Enter question you want to ask");
		String ques = s.nextLine();

		discussBean.setQuestion(ques);
		discussBean.setStatus(0);
		discussBean.setUserid(UserController.user.getId());
		discussBean.setAnswer("Will update the response soon");
		if (dao.insertQuestion(discussBean)) {
			System.out.println("Question successfully added");
		} else {
			System.out.println("Unable to add question");
		}
	}// End of question()

	public static void listQuestion() {
		List<DiscussionBean> discussionList = dao.getQuestions();
		System.out.println("***************************************************************");
		System.out.printf("%10s %20s %20s", "Message Id", "User ID", "Question");
		System.out.println();
		System.out.println("***************************************************************");
		for (DiscussionBean bean : discussionList) {
			System.out.format("%10s %20s %20s", bean.getMessageid(), bean.getUserid(), bean.getQuestion());
			System.out.println();
		}
		System.out.println("***************************************************************");
		System.out.println("Enter message id you want to answer");
		int msgId = s.nextInt();
		for (DiscussionBean d : discussionList) {
			if (d.getMessageid() == msgId) {
				System.out.println("enter answer");
				s.nextLine();
				String ans = s.nextLine();
				//s.nextLine();
				d.setAnswer(ans);
				dao.answerQuestion(d);
				System.out.println("successful");
			}
		}

	}// End of listQuestion()

}// End of class
