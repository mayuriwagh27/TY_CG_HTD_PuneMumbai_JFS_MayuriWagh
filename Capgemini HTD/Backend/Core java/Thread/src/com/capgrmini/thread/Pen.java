package com.capgrmini.thread;

public class Pen extends Thread {         //Thread is inbuilt class in java
 public void run() {
	 for (int i=0;i<5;i++) {
		 System.out.println(i);
		 try {
			sleep(1000);                  //Causes the currently executing thread to sleep (temporarily cease
		                                             // execution) for the specified number of milliseconds 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
 }
}
