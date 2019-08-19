package com.java.ds;

public class StackOverFlowError {
	public void show() {
		this.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= new Thread("hello");
		Thread t1= new Thread("by");
		StackOverFlowError s= new StackOverFlowError();
		s.show();
				

	}

}
