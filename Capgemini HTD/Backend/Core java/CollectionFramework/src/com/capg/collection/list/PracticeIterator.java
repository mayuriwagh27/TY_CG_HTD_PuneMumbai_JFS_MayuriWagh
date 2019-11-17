package com.capg.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeIterator {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(2);
		a.add("Priya");
		a.add(5.6);
		a.add('F');
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
	}

}
