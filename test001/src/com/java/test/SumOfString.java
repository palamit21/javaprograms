package com.java.test;

public class SumOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "12";  
	    String str2 = "198119"; 
	    
	    // Reverse both of Strings 
	    str1=new StringBuilder(str1).reverse().toString(); 
	    str2=new StringBuilder(str2).reverse().toString(); 
		
		String str="";
	
		
		  int carry = 0;  
		    for (int i = 0; i < str1.length(); i++)  
		    {  
		        // Do school mathematics, compute sum of  
		        // current digits and carry  
		        int sum = ((int)(str1.charAt(i) - '0') +  
		                    (int)(str2.charAt(i) - '0') + carry);  
		        str += (char)(sum % 10 + '0');  
		  
		        // Calculate carry for next step  
		        carry = sum / 10;  
		    }
		 // Add remaining digits of larger number  
		    for (int i = str1.length(); i < str2.length(); i++)  
		    {  
		        int sum = ((int)(str2.charAt(i) - '0') + carry);  
		        str += (char)(sum % 10 + '0');  
		        carry = sum / 10;  
		    }  
		  
		    // Add remaining carry  
		    if (carry > 0)  
		        str += (char)(carry + '0');  
		  
		    // reverse resultant String 
		    str = new StringBuilder(str).reverse().toString(); 
		  
		    System.out.println(str); 
		    
		    

	}

}
