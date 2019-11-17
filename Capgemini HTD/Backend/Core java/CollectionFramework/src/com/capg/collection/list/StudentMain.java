package com.capg.collection.list;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Students> a= new ArrayList<Students>();
		Students s1=new Students(1, "Priya", 56.95);
		Students s2=new Students(2, "Divya", 97.55);
		Students s3=new Students(3, "Raju", 52.65);
		Students s4=new Students(4, "Rakesh", 55.65);
		Students s5=new Students(5, "Sonu", 23.36);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		for(int i=0;i<5;i++) {
			Students s= a.get(i);
			System.out.println("Name is: "+s.name);
			System.out.println("id is: "+s.id);
			System.out.println("percentage is: "+s.percentage);
			System.out.println("--------------------------");
		}

	}

}
