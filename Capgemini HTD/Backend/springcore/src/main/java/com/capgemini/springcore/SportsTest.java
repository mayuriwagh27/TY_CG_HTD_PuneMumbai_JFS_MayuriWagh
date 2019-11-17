package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.bean.Sports;

public class SportsTest {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("sportsConfig.xml");
Sports sports = context.getBean("sports", Sports.class);

System.out.println("Sport name is: "+ sports.getName());
System.out.println("Total players: "+sports.getTotalPlayers());
System.out.println("Team info: "+ sports.getTeamInfo());
	}//End of main()

}//End of class
