package com.test.thread;

public class ThreadTest1 extends Thread {
	
	public static void main(String[] args) {
		Thread t  = new ThreadTest1();
		t.start();
		System.out.println("Outside the Thread");
	}

	@Override
	public void run() {
		System.out.println("Executing the thread");
	}
}
