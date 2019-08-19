package com.java.test;

public class ZeroNonZero {

	public static void main(String[] args) {
		int a []= {0,0,0,10,5,3,0,5,0,0,6};	
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				a[i]=a[index];
				a[index++]=0;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
		Square s= (int x)->x+x;
		int z=s.findSquare(5);
		System.out.println(".............."+z);

	}
	

	

}
