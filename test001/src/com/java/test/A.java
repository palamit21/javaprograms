package com.java.test;

public class A {

	public static void main(String[] args) {
		// 22,121,8,9,11
		//121,22-->2
		//11,8-->1
		int global = 121;

		int reverse = 0;
		for (int i = 0; i < global; i++) {
			reverseNO(i, reverse, global);

		}

	}

	private static void reverseNO(int n, int reverse, int global) {
		int a=Math.min(25, 22);
		//System.out.println("Min"+a);
		int k = n;

		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
			if((k + reverse) == global) {
				break;
			}

		}
	
			//29,92
			//System.out.println(reverse);
			if ((k + reverse) == global) {
				System.out.println("rev " + reverse);
				return ;

			}

		

	}

}
