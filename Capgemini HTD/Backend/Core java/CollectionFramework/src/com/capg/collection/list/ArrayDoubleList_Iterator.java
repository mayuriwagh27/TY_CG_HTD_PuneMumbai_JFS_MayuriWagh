package com.capg.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayDoubleList_Iterator {

	public static void main(String[] args) {
		ArrayList<Double> a= new ArrayList<Double>();
		
		a.add(2.3);
		a.add(3.2);
		a.add(5.9);
		a.add(4.6);
		
		System.out.println("------------------Forward");
		ListIterator<Double> it=a.listIterator();
		while(it.hasNext()) {
			Double r=it.next();
			System.out.println(r);
		}
System.out.println("------------------------Backword");
while(it.hasPrevious()) {
	Double m=it.previous();
	System.out.println(m);
}
	}

}
