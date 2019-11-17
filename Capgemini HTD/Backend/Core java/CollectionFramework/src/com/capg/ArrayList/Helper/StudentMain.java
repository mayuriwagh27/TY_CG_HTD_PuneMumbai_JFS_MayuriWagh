package com.capg.ArrayList.Helper;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> a= new ArrayList<Student>();
		Student s1=new Student(1, "Priya", 34.95);
		Student s2=new Student(2, "Divya", 97.55);
		Student s3=new Student(3, "Raju", 52.65);
		Student s4=new Student(4, "Rakesh", 55.65);
		Student s5=new Student(5, "Sonu", 23.36);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		Student_Helper h= new Student_Helper();
		h.display(a);
		h.onlypass(a);
        h.distinction(a);

	}

}
