package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int a[]= {1,2,2,34,6,39,-1};
		int h= a[0];
		int s=0;
		int smallest=Integer.MIN_VALUE;
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]<smallest) {
				smallest=a[i];
				
			}
			
			if(a[i]>h) {
				s=h;
				h=a[i];
				
				
			}else if(a[i]>s) {
				s=a[i];
				
			}
			
		}
		
		System.out.println(h+" jjjj"+s+" min"+smallest);
		
	}}


