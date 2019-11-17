package com.capg.ArrayList.Helper;

import java.util.ArrayList;
import java.util.Iterator;


public class Student_Helper {
void display(ArrayList<Student> a) {
	for(Student s:a) {
		System.out.println("Nmae is: "+s.id);
		System.out.println("Id is: "+s.name);
		System.out.println("Percentage is: "+s.percentage);
		}
	System.out.println("------------Only Passed--------------");

	}
void onlypass(ArrayList<Student> k) {
Iterator<Student> it=k.iterator();
while(it.hasNext()) {
	Student s=it.next();
	if(s.percentage>=35) {
	System.out.println("Nmae is: "+s.id);
	System.out.println("Id is: "+s.name);
	System.out.println("Percentage is: "+s.percentage);
	}
	}
System.out.println("-------------Distiction-------------");
}
void distinction(ArrayList<Student> k) {
	Iterator<Student> it=k.iterator();
	while(it.hasNext()) {
		Student s=it.next();
		if(s.percentage>=70) {
		System.out.println("Nmae is: "+s.id);
		System.out.println("Id is: "+s.name);
		System.out.println("Percentage is: "+s.percentage);

}
}
}
}