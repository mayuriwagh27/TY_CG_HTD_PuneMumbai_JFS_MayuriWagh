package com.capg.ArrayList.Helper;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("Raju");
		a.add("Mayuri");
		a.add("Anjali");
		a.add("Snehal");

Collections.sort(a);
System.out.println(a);
Collections.shuffle(a);
System.out.println(a);
	}

}
