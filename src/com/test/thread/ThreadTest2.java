package com.test.thread;

public class ThreadTest2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread(), "Thread A");
		Thread t2 = new Thread(new MyThread(), "Thread B");
		t1.start();
		t2.start();
		System.out.println("Thread 1 alive: " + t1.isAlive());
		System.out.println("Thread 2 alive: " + t2.isAlive());
		System.out.println("Thread 1 priority: " + t1.getPriority());
		System.out.println("Thread 2 priority: " + t2.getPriority());
		
		try {
			t1.join();
			System.out.println("Thread 1 has completed");
			Thread.sleep(2000);
			t2.join();
			System.out.println("Thread 2 has completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		Thread.State state = Thread.currentThread().getState();
		String name = Thread.currentThread().getName();
		System.out.println("Current State of " + name + " and state is " + state);
	}
	
}
