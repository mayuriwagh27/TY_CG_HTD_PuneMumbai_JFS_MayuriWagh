package com.capg.ArrayList.Helper;

import java.util.LinkedList;
import java.util.Collections;

public class ForAddMthods {

	public static void main(String[] args) {
		LinkedList<Double> a=new LinkedList<Double>();
		a.add(3.6);
		a.add(2.4);
		a.add(4.7);
		a.add(1.6);
		System.out.println("Before-----------------"+a);
		Collections.sort(a);
		System.out.println("After-----------------"+a);
		
		

		}
		

	}


