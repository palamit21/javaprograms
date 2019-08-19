package com.java.test;

public class HelloWorld {

	public static void main(String[] args) {

		String s1 = "abc";
		s1.concat("ab");
		System.out.println(s1);
		Object data;
//data=10;
		data = true;
		int a = 2;
		int b = 2;
		for (int z = 0; z < 5; z++) {
			if ((++a > 2) & (b++ > 2)) {
				a++;

			}

		}
		System.out.println(a + " j" + b);
		Thread t = new Thread();
		t.run();
		System.out.println("main");

	}
}
