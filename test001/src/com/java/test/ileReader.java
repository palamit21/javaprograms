package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ileReader {
	public static void main(String... args) {
		
		
		
    List<AppDetails> appDetail = readBooksFromCSV("C:\\Users\\31733\\Desktop\\book1.csv");
    
Map<String,String>map= new HashMap<>();
    // let's print all the person read from CSV file
    for (AppDetails b : appDetail) {
    	String s[]=b.getVersion().split("(?<=\\D)(?=\\d)");
    	
    	if(!map.containsKey((b.getApi()))) {
    		map.put(b.getApi(), s[1]);
    		
    		
    	}else if(Integer.valueOf(map.get(b.getApi()))<Integer.valueOf(s[1])) {
    		map.put(b.getApi(), s[1]);
    	}
    		
    	
    	
    	
    	
       
    }
    for (AppDetails appDetails : appDetail) {
    	String s[]=appDetails.getVersion().split("(?<=\\D)(?=\\d)");
    	if((Integer.valueOf(s[1])<Integer.parseInt(map.get(appDetails.getApi())))) {
    		System.out.println(""+appDetails.getAppName()+"  "+appDetails.getApi());
    		
    	}
		
	}
    
}

private static List<AppDetails> readBooksFromCSV(String fileName) {
    List<AppDetails> appdetail = new ArrayList<>();
    Path pathToFile = Paths.get(fileName);

    // create an instance of BufferedReader
    // using try with resource, Java 7 feature to close resources
    BufferedReader br;
    BufferedReader br1;
	try {
		br1 = Files.newBufferedReader(pathToFile,
		        StandardCharsets.US_ASCII);
		br= Files.newBufferedReader(pathToFile);
	
    

        // read the first line from the text file
        String line = br.readLine();

        // loop until all lines are read
        while (line != null) {

            // use string.split to load a string array with the values from
            // each line of
            // the file, using a comma as the delimiter
            String[] attributes = line.split(",");

            AppDetails book = createBook(attributes);

            // adding book into ArrayList
            appdetail.add(book);

            // read next line before looping
            // if end of file reached, line would be null
            line = br.readLine();
        }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   

    return appdetail;
    
    
}

private static AppDetails createBook(String[] metadata) {
    String appName = metadata[0];
    String api = metadata[1];
    String Version = metadata[2];

    // create and return book of this metadata
    return new AppDetails(appName, api, Version);
}

}



class AppDetails {
private String appName;
private String api;


public AppDetails(String appName, String api, String version) {
	super();
	this.appName = appName;
	this.api = api;
	Version = version;
}
public String getAppName() {
	return appName;
}
@Override
public String toString() {
	return "AppDetails [appName=" + appName + ", api=" + api + ", Version=" + Version + "]";
}
public void setAppName(String appName) {
	this.appName = appName;
}
public String getApi() {
	return api;
}
public void setApi(String api) {
	this.api = api;
}
public String getVersion() {
	return Version;
}
public void setVersion(String version) {
	Version = version;
}
private String Version;




}

