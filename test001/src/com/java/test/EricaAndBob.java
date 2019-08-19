package com.java.test;

public class EricaAndBob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String e="HH";
		String b="EEE";
		if(scoreCalucater(e)>scoreCalucater(b)) {
			System.out.println("erica");
			
		}else
		{
			System.out.println("bob");
		}
		

	}

	private static int scoreCalucater(String s) {
		int bobScore=0;
		
		for(int i=0;i<s.length();i++) {
			char  c= s.charAt(i);
			
		switch (c) {
		case 'E':
			bobScore=bobScore+1;
			break;
			
			

		case 'M':
			bobScore=bobScore+3;
			break;
			
			
		case 'H':
			bobScore=bobScore+5;
			break;
		}
		}
		return bobScore;
	}

}
