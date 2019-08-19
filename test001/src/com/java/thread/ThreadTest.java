package com.java.thread;

public class ThreadTest implements Runnable {
	String name;

	public ThreadTest(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadTest o= new ThreadTest("Amit");
		
		
		Thread t1= new Thread(o,"pal");
		Thread t2= new Thread(o,"kumar");
		t1.start();
		t1.join();
		t2.start();
		t2.join();

	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
        
        
             System.out.println(threadName);
          
		
	}

}
