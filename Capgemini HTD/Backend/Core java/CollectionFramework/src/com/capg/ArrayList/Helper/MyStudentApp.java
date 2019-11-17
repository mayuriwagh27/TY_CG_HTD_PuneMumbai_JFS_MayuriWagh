package com.capg.ArrayList.Helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyStudentApp {
 private static ArrayList<Student> a=new ArrayList<Student>();
  static Scanner s=new Scanner(System.in);
  //Method add
  void add() {
	  System.out.println("Enter ID");
	 int id= s.nextInt();
	  System.out.println("Enter name");
	  String name= s.next();
	  System.out.println("Enter percentage");
	  double percentage= s.nextDouble();
Student s= new Student(id, name, percentage );
a.add(s);
}
  
  void display() {
	  Iterator<Student> it=a.iterator();
	  while(it.hasNext()) {
		  Student b=it.next();
		  System.out.println("Name is: "+b.name);
		  System.out.println("ID is: "+b.id);
		  System.out.println("Percentage is: "+b.percentage);

	  }
  }
  
  
}
