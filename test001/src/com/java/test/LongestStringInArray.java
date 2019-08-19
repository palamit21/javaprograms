package com.java.test;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String	arr[] = {"geeks", "for", "geeksforgeeks", "geeksfor"};
	String arr1[] = {"Hey", "you", "stop", "right", "there"};
	
	System.out.println(longestSurString(arr));

	}
	public static String longestSurString(String[] ss) {
	    Arrays.sort(ss, new ListCompare ());
	    System.out.println(Arrays.toString(ss));
	    
	    for (String S: ss) {
	    	
	        String b = new String(S);
	        for (String s: ss) {
	        	
	            if (!s.equals(b) && S.contains(s)) {
	                S = S.replace(s, "");
	            }
	            
	        }
	        if (S.length() == 0)
	            return b;
	        
	    }
	    return null;
	}

}

class ListCompare implements Comparator<String> {
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return 1;
        else if (s1.length() > s2.length())
            return -1;
        else
            return 0;
    }
}
