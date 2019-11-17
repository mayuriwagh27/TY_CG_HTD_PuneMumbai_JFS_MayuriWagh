package com.capgemini.springcore.annotation.bean;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal {

	public void eat() {
	System.out.println("Eating pedegree");
	}

	public void speak() {
		System.out.println("Dog id sleeping");

	}

	public void walk() {
		System.out.println("Dod is walking");

	}

}//end of class
