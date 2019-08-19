package com.java.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReadFileJava8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	String fileName="C:\\Users\\31733\\Desktop\\appdetail.txt.txt";
	try {
		
		Stream<String> stream1 = Files.lines(Paths.get(fileName));
		stream1.forEach(i->{
			System.out.println(i);
			String[] s=i.split("\\s");
			System.out.println("word by word  "+s[0]+"    "+s[1]);
			
			
		});
	
		
	} catch (IOException e1) {
		
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
			
		

}
}