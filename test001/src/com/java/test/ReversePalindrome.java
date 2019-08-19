package com.java.test;

public class ReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";

		System.out.println(isPalindrome(s));
		int outPut = isPalindromeIntInt(121, 0);
		System.out.println(outPut);

	}

	private static boolean isPalindrome(String str) {
		
		if (str.length() == 0 || str.length() == 1) {
			return true;
		}

		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return isPalindrome(str.substring(1, str.length() - 1));
		}
		return false;

	}
	
private static int isPalindromeIntInt(int n,int temp) {
		
		
	 // base case 
    if (n == 0) 
        return temp; 
  
    // stores the reverse 
    // of a number 
    temp = (temp * 10) + (n % 10); 
  
    return isPalindromeIntInt(n / 10, temp); 

}
}
