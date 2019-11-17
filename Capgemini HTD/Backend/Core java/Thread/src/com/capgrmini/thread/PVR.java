package com.capgrmini.thread;

public class PVR {
synchronized void confirm() {
	 
	 for (int i =0;i<5;i++) {
		 
	 System.out.println(i);

	 try {
		wait();
		Thread.sleep(1000);
	} catch (InterruptedException e) 
	 {
		e.printStackTrace();
	}
 }
 }


synchronized void leaveMe() {
	System.out.println("Notify is called");            //method
	notify();
}
}