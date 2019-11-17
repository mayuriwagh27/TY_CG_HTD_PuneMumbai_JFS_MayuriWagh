package com.capgemini.springcore.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Panda implements Animal {

	public void eat() {
		System.out.println("Eating bamboo");
	}

	public void speak() {
		System.out.println("Panda Squaks");
	}

	public void walk() {
		System.out.println("Panda is walking");
	}

}//end of class

