package com.java.test;

import java.util.Arrays;

public class BinarySearch {
	 String str;
	
	public      BinarySearch(){
		System.out.println();
		str ="hello world";
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,1,3,4,55,6,6,7,7,55};
		boolean found =false;
		int current =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (current==arr[i] && !found) {
				found =true;
				
			} else if(current!=arr[i]) {
				System.out.println(current);
				found =false;
				current =arr[i];

			}
			
		}
		System.out.println(current);
		
		System.out.println(Arrays.toString(removeDuplicates(arr)));
	}
	public static int[] removeDuplicates(int[] arr){
	    int end = arr.length;

	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (arr[i] == arr[j]) {                  
	               
	                arr[j] = arr[end-1];
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] whitelist = new int[end];
	    /*for(int i = 0; i < end; i++){
	        whitelist[i] = arr[i];
	    }*/
	    System.arraycopy(arr, 0, whitelist, 0, end);
	    return whitelist;
	}

}
