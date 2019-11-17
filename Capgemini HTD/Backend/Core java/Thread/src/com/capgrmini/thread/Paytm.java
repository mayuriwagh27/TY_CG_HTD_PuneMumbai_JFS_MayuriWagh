package com.capgrmini.thread;

public class Paytm extends Thread {
PVR ref;
public Paytm(PVR r){
	this.ref =r;                //constructor
}
@Override
	public void run() {
		ref.confirm();
	}
}



