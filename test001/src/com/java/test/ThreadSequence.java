package com.java.test;

public class ThreadSequence implements Runnable {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadSequence ts= new ThreadSequence();
		
		Thread t1= new Thread(ts);
		Thread t2= new Thread(ts);
		Thread t3= new Thread(ts);
	
			
			t1.start();
			t1.join();
			
			t2.start();
			t2.join();
			
			t3.start();
			t3.join();
			
		
		

	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread Name  "+Thread.currentThread().getName());
	}

}
