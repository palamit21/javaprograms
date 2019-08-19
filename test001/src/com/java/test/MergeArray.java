package com.java.test;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int a[]= {1, 4, 6, 5};
		int b[]= {2, 3, 4, 8};
		int c=a.length;
		int  temp[]=new int[a.length+b.length];
		int count =0;
		for (int i = 0; i<=a.length-1; i++) {
			
			if(a[i]<b[i]) {
				
				temp[count]=a[i];
				temp[count+1]=b[i];
				count=count+2;
				
			}else if(a[i]>b[i]) {
				
				temp[count]=b[i];
				temp[count+1]=a[i];
				count=count+2;
				
			}
			
			
		}
		System.out.println(Arrays.toString(temp));

	}

}
